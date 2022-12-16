package com.dfm.boot.example.helper.excel;

import com.alibaba.excel.EasyExcel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;

/**
 * @Author:fengming.dai
 */
@Slf4j
@Component
public class ExcelUtil {

    @Autowired
    DataDealUtil dataDealUtil;

    /**
     * excel 导入
     */
    public void importFile(String path, Long taskId){
        if (!StringUtils.hasText(path)){
            log.info("path 为空！！");
            return;
        }
        File file = new File(path);
        String fileName = file.getName();
        log.info("导入文件开始：fileName ={}",fileName);
        List<UploadCustomerData> importItems = null;
        try {
            importItems = EasyExcel.read(new FileInputStream(file),new UploadCustomerListener(dataDealUtil,taskId))
                    .head(UploadCustomerData.class).doReadAllSync();
        } catch (Exception e ) {
            e.printStackTrace();
        }
        log.info("导入文件开始结束：fileName ={}",fileName);
    }
}
