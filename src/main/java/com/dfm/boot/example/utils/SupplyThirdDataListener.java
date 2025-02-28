//package com.dfm.boot.example.utils;
//
//import com.dfm.boot.example.mappers.IMapper;
//import io.netty.util.concurrent.DefaultThreadFactory;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationListener;
//import org.springframework.scheduling.annotation.Async;
//import org.springframework.stereotype.Component;
//import org.springframework.util.CollectionUtils;
//import org.springframework.util.StringUtils;
//import tk.mybatis.mapper.entity.Example;
//
//import javax.annotation.Resource;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Random;
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.LinkedBlockingQueue;
//import java.util.concurrent.ThreadPoolExecutor;
//import java.util.concurrent.TimeUnit;
//import java.util.stream.Collectors;
//
///**
// * @Author:fengming.dai
// */
//@Slf4j
//@Component
//public class SupplyThirdDataListener implements ApplicationListener<SupplyThirdDataEvent> {
//
//
//
//    private static final ThreadPoolExecutor executor = new ThreadPoolExecutor(
//            10, 20, 60, TimeUnit.SECONDS,
//            new LinkedBlockingQueue<>(), new DefaultThreadFactory("supplyBatch"));
//
//
//    @Override
//    public void onApplicationEvent(SupplyThirdDataEvent event) {
//        Long taskId = event.getTaskId();
//        log.info("接收到taskId={}的任务，开始处理----------------",taskId);
//        asyncMethod();
//        log.info("taskId={}的任务，处理完成----------------",taskId);
//    }
//
//    public void asyncMethod(){
//        log.info("异步方法开始-------");
//
//        log.info("异步方法结束-------");
//    }
//}
