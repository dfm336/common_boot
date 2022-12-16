//package com.dfm.boot.example.helper.excel;
//
//import io.netty.util.concurrent.DefaultThreadFactory;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.scheduling.annotation.Async;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.event.TransactionPhase;
//import org.springframework.transaction.event.TransactionalEventListener;
//
//import java.util.concurrent.LinkedBlockingQueue;
//import java.util.concurrent.ThreadPoolExecutor;
//import java.util.concurrent.TimeUnit;
//
///**
// * @Author:fengming.dai
// */
//@Slf4j
////@Component
//public class SupplyThirdDataListener {
//
//
//    private static final ThreadPoolExecutor executor = new ThreadPoolExecutor(
//            10, 20, 60, TimeUnit.SECONDS,
//            new LinkedBlockingQueue<>(), new DefaultThreadFactory("supplyBatch"));
//
//    static {
//        executor.allowCoreThreadTimeOut(true);
//    }
//
//
//    /**
//     * 事务提交后 执行
//     *
//     * @param event
//     */
////    @Async("ExcelDealPool")
////    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
////    public void onApplicationEvent(ExcelDataEvent event) {
////
////
////    }
//
//
//}
