package com.dfm.boot.example.helper.excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.util.ListUtils;
import com.dfm.boot.example.utils.ValidateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;

import javax.validation.ConstraintViolation;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/**
 * easyExcel 处理 导入
 *
 * @Author:fengming.dai
 */
@Slf4j
public class UploadCustomerListener implements ReadListener<UploadCustomerData> {
    /**
     * 每隔5条存储数据库，实际使用中可以100条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 200;
    /**
     * 已经导入个数
     */
    private static AtomicLong IMPORT_COUNT = new AtomicLong(0);
    private List<UploadCustomerData> cachedDataList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);
    /**
     * 假设这个是一个DAO，当然有业务逻辑这个也可以是一个service。当然如果不用存储这个对象没用。
     */
    private DataDealUtil bizUtil;

    /**
     * 该次导入 关联的 taskId
     */
    private Long taskId;

    public UploadCustomerListener() {
        // 这里是demo，所以随便new一个。实际使用如果到了spring,请使用下面的有参构造函数
        bizUtil = new DataDealUtil();
    }

    /**
     * 如果使用了spring,请使用这个构造方法。每次创建Listener的时候需要把spring管理的类传进来
     *
     * @param bizUtil
     */
    public UploadCustomerListener(DataDealUtil bizUtil, Long taskId) {
        this.bizUtil = bizUtil;
        this.taskId = taskId;
    }

    /**
     * 这个每一条数据解析都会来调用
     *
     * @param data    one row value. Is is same as {@link AnalysisContext#readRowHolder()}
     * @param context
     */
    @Override
    public void invoke(UploadCustomerData data, AnalysisContext context) {
        log.info("解析到一条数据:{}", data);

        validate(data);
        cachedDataList.add(data);
        IMPORT_COUNT.getAndIncrement();
        // 达到BATCH_COUNT了，需要去存储一次数据库，防止数据几万条数据在内存，容易OOM
        if (cachedDataList.size() >= BATCH_COUNT) {
            saveData();
            // 存储完成清理 list
            cachedDataList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);
        }
    }

    /**
     * 校验 必填，是否 填入正确枚举
     *
     * @param customerData
     */
    private void validate(UploadCustomerData customerData) {
        Set<ConstraintViolation<UploadCustomerData>> errors = ValidateUtil.validateFast(customerData);
        if (!CollectionUtils.isEmpty(errors)) {
            long row = IMPORT_COUNT.get() + 5;
            throw new RuntimeException("报送数据填报错误！第" + row + "行，" + errors.iterator().next().getMessage());
        }
    }

    /**
     * 所有数据解析完成了 都会来调用
     *
     * @param context
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        // 这里也要保存数据，确保最后遗留的数据也存储到数据库
        saveData();
        log.info("所有数据解析完成！");
        if (IMPORT_COUNT.get() == 0) {
            throw new RuntimeException("未导入有效数据！");
        }
        //导入计数器 归零
        IMPORT_COUNT = new AtomicLong(0L);
    }

    /**
     * 加上存储数据库
     */
    private void saveData() {
        log.info("{}条数据，开始存储数据库！", cachedDataList.size());
        bizUtil.save(cachedDataList, taskId);
        log.info("存储数据库成功！");
    }
}
