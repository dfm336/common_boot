package com.dfm.boot.example.utils;

import com.dfm.boot.example.mappers.RepositoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Author:fengming.dai
 */
@Component
public class CommonUtil {

    @Resource
    RepositoryMapper repositoryMapper;

    @Autowired
    ApplicationContext applicationContext;

    @Transactional(rollbackFor = Exception.class)
    public void enterMethod(){

        applicationContext.publishEvent(new SupplyThirdDataEvent(this,null));
    }
}
