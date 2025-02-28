package com.dfm.boot.example;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import com.dfm.boot.example.domain.*;
import com.dfm.boot.example.mappers.*;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.lang.management.ThreadMXBean;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Slf4j
@SpringBootTest
class ExampleApplicationTests {

    @Test
    void contextLoads() {
    }

    @Resource
    private RepositoryMapper repositoryMapper;


    @Resource
    CylRosterAllMapper cylRosterAllMapper;

    @Resource
    GfRosterMapper gfRosterMapper;

    @Resource
    ZsRosterMapper zsRosterMapper;


    @Resource
    JdApplyRecordMapper jdApplyRecordMapper;


    /**
     *
     消息监听逻辑。
     1. 根据 渝链贷 申请 记录表。 判定 当前 creditCode 是否 存在。
     2. 如果 存在，， 直接 调用
     3. 如果 不存在，  根据 【限制供应商数量】字典值  和  当日新增的供应商数量 做匹配
     3.1 如果 符合 限制，，调用 推送接口 查询
     3.2 如果不符合， 不做查询。

     */
    @Test
    public void testJdConsumer(){
        String creditCode = "";

        //check exist
        Example example = new Example(JdApplyRecord.class);
        example.createCriteria()
                        .andEqualTo(JdApplyRecord.CREDIT_CODE,creditCode);
        List<JdApplyRecord> jdApplyRecords = jdApplyRecordMapper.selectByExample(example);
        boolean exist = !CollectionUtils.isEmpty(jdApplyRecords);

        if ( exist ){

        }else {
            Integer limitAdd = 10;

            //query today add
            Date now = new Date();
            DateTime beginOfDay = DateUtil.beginOfDay(now);
            DateTime endOfDay = DateUtil.endOfDay(now);
            example.clear();

            example.createCriteria()
                    .andGreaterThanOrEqualTo(JdApplyRecord.GMT_CREATE,beginOfDay)
                    .andLessThanOrEqualTo(JdApplyRecord.GMT_CREATE,endOfDay);
            List<JdApplyRecord> list = jdApplyRecordMapper.selectByExample(example);
            Integer addedCnt = CollectionUtils.isEmpty(list) ? 0 : list.size();

            //match limit
            if ( addedCnt < limitAdd ){
                JdApplyRecord add = new JdApplyRecord();
                add.setCreditCode(creditCode);
                add.setGmtCreate(now);

                jdApplyRecordMapper.insert(add);

                //sync cll redord
            }

        }
    }

    @Test
//    @Transactional(rollbackFor = Exception.class)
    public void moveData(){
//        List<GfRoster> gfRosters = gfRosterMapper.selectAll();
//        List<CylRosterAll> adds = new ArrayList<>();
//        for (GfRoster gfRoster : gfRosters) {
//            CylRosterAll tmp = new CylRosterAll();
//            BeanUtils.copyProperties(gfRoster,tmp);
//            tmp.setId(null);
//            tmp.setCoreEntType(CoreEntEnums.GF.getCode());
//            adds.add(tmp);
//        }
//        cylRosterAllMapper.insertList(adds);

        List<ZsRoster> zsRosters = zsRosterMapper.selectAll();
        List<CylRosterAll> zsAdds = new ArrayList<>();
        for (ZsRoster zsRoster : zsRosters) {
            CylRosterAll tmp = new CylRosterAll();
            BeanUtils.copyProperties(zsRoster,tmp);
            tmp.setId(null);
            tmp.setCoreEntType(CoreEntEnums.ZS.getCode());
            zsAdds.add(tmp);
        }
        cylRosterAllMapper.insertList(zsAdds);

    }

    private static final DateTimeFormatter dayFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static void main(String[] args) throws InterruptedException {
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 20, 5, TimeUnit.SECONDS, new ArrayBlockingQueue<>(50));
//        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
//        String jvmName = runtimeMXBean.getName();
//        System.out.println("jvmName = " + jvmName);
//
//        String pidName = jvmName.split("@")[0];
//        long pid = Long.parseLong(pidName);
//
//        System.out.println("pid = " + pid);
//
//
//        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
//        for (int i = 0; i < 20; i++) {
//            threadPoolExecutor.execute(()->{
//                System.out.println("当前线程总数为："+threadMXBean.getThreadCount());
//            });
//        }
//        threadPoolExecutor.shutdown();
//
//        Thread.sleep(1000);
//        System.out.println("线程总数为："+threadMXBean.getThreadCount());
        String earliestInvoiceDate = "2019-12-01";
        updateString(earliestInvoiceDate);
        System.out.println("earliestInvoiceDate = " + earliestInvoiceDate);
        LocalDate earliestDate = LocalDate.parse(earliestInvoiceDate, dayFormatter);
        Integer joinMonth = calculateJoinMonth(earliestDate);
        System.out.println("joinMonth = " + joinMonth);
    }

    public static void  updateString(String earliestInvoiceDate) {
        earliestInvoiceDate = "2017-12-01";
    }

    /**
     * 计算该日期距离 today 的月份数量
     * @param earliestDate
     * @return
     */
    public static Integer calculateJoinMonth(LocalDate earliestDate) {
        LocalDate today = LocalDate.now();
        Period period = Period.between(earliestDate, today);
        return 12 * period.getYears() + period.getMonths();
    }

    /**
     *  3k  数据。 idx_title key(title) 普通索引
     *  左右模糊  %制度% 778ms
     *  右模糊  制度% 724ms
     *
     *  3w 数据  idx_title key(title) 普通索引
     *   左右模糊  %制度%     971ms
     *   右模糊    制度%     850ms
     *
     *   3w 数据  fulltext_title FULLTEXT KEY(title) 全文索引
     *      左右模糊  制度     723ms  (数据不准确）
     *
     *     - mysql 8.0   cost 536
     *     - mysql 5.7  cost 677
     *
     *  instr 实现
     *  3w   全文索引 左右模糊， 907
     *      idx_title   1009
     *      idx_title limit 5   cost 751
     *     full_text  limit 5    758
     *
     *
     */
    @Test
    public void searchTitle(){
        String title = "物料";
        long start = System.currentTimeMillis();
        List<Repository> list = repositoryMapper.searchTitleFullTextIndex(title);
        long end = System.currentTimeMillis();
        log.info("cost :{}",end-start);

        System.out.println("*************DATA********************");
        list.stream().forEach(System.out::println);
    }

    @Test
    public void test(){

        Example example = new Example(Repository.class);
        example.createCriteria()
                .andGreaterThan(Repository.ID,5128278);
        repositoryMapper.deleteByExample(example);

        List<Repository> repositories = repositoryMapper.selectAll();

        for (Repository repository : repositories) {
            List<Repository> adds = Lists.newArrayList();
            for (int i=0; i< 2000; i++){
                Repository cp = new Repository();
                BeanUtils.copyProperties(repository,cp);
                cp.setTitle(cp.getTitle()+":"+i);
                cp.setId(null);
                adds.add(cp);
            }
            long start = System.currentTimeMillis();
            repositoryMapper.insertList(adds);
            long end = System.currentTimeMillis();
            log.info("cost :{}",end-start);
        }
    }

}
