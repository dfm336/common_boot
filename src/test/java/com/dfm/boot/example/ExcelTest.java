package com.dfm.boot.example;

import com.dfm.boot.example.helper.excel.ExcelUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author:fengming.dai
 */
@Slf4j
@SpringBootTest
public class ExcelTest {

    @Autowired
    ExcelUtil excelUtil;


    @Test
    public void testImport(){
        String path = "/Users/td/Desktop/ZSWL/经分/项目信息.xlsx";

        excelUtil.importFile(path,null);
    }

}
