package com.dfm.boot.example.delayQueue.manager;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:fengming.dai
 */
@Component
public class DelayMessageFactory implements ApplicationContextAware, InitializingBean {

    private ApplicationContext applicationContext;

    private Map<String, DelayMessageManager> map = new HashMap<>(2);

    @Override
    public void afterPropertiesSet() throws Exception {
        Map<String, DelayMessageManager> beans = applicationContext.getBeansOfType(DelayMessageManager.class);
        //不用判空，自己写的 Factory，肯定是 写了 实现类的
        beans.entrySet().stream().forEach(itm->{
            DelayMessageManager manager = itm.getValue();
            map.put(manager.managerType(),manager);
            //也可在这 运行一些 所有实现都要运行的的方法
            manager.init();
        });
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public DelayMessageManager getManager(String type){
        return map.get(type);
    }
}
