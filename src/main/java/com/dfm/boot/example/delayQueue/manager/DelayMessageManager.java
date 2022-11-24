package com.dfm.boot.example.delayQueue.manager;

import com.dfm.boot.example.delayQueue.DelayMessage;

/**
 * 延时消息管理器
 * @Author:fengming.dai
 */
public interface DelayMessageManager {
    /**
     * 添加 延时消息
     */
    void add(DelayMessage msg);

    /**
     * 移除 延时消息
     * @param msg
     * @return
     */
    boolean remove(DelayMessage msg);

    /**
     * 阻塞式 消费数据
     * 阻塞队列有数据就返回，否则wait
     * @return
     */
    DelayMessage concumer();

    void destry();

    void  init();

    String managerType();

}
