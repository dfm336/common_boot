//package com.dfm.boot.example.delayQueue.manager;
//
//import com.dfm.boot.example.delayQueue.DelayMessage;
//import com.dfm.boot.example.delayQueue.manager.DelayMessageManager;
//import lombok.extern.slf4j.Slf4j;
//import org.redisson.api.RBlockingQueue;
//import org.redisson.api.RDelayedQueue;
//import org.redisson.api.RedissonClient;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
///**
// * @Author:fengming.dai
// */
//@Slf4j
//@Component
//public class RedissionDelayMessageManager implements DelayMessageManager {
//
//    @Autowired
//    RedissonClient redissonClient;
//
//    RBlockingQueue<DelayMessage> rBlockingQueue;
//
//    private RDelayedQueue<DelayMessage> rDelayedQueue;
//
//    @Override
//    public void add(DelayMessage msg) {
//        if (rDelayedQueue.contains(msg)){
//            return;
//        }
//        log.info("redission-delay-queue,add msg = {}",msg);
//        rDelayedQueue.offer(msg,msg.getExpire(),msg.getUnit());
//    }
//
//    @Override
//    public boolean remove(DelayMessage msg) {
//        return rDelayedQueue.remove(msg);
//    }
//
//    @Override
//    public DelayMessage concumer() {
//        DelayMessage delayMessage = null;
//        try {
//            delayMessage = rBlockingQueue.take();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//            log.info("rBlockQueue consumer failed！！！ ...");
//        }
//        return delayMessage;
//    }
//
//    @Override
//    public void destry() {
//        rDelayedQueue.destroy();
//    }
//
//    @Override
//    public void init() {
//        this.rBlockingQueue = redissonClient.getBlockingQueue("consumer-queue");
//        this.rDelayedQueue = redissonClient.getDelayedQueue(this.rBlockingQueue);
//    }
//
//    @Override
//    public String managerType() {
//        return "redission";
//    }
//
//
//}
