package com.dfm.boot.example.delayQueue.consumer;

import com.dfm.boot.example.delayQueue.DelayMessage;
import com.dfm.boot.example.delayQueue.manager.DelayMessageFactory;
import com.dfm.boot.example.delayQueue.manager.DelayMessageManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executors;

/**
 * @Author:fengming.dai
 */
@Component
public class RedissionDelayQueueConsumer implements ApplicationRunner {
    @Autowired
    DelayMessageFactory delayMessageFactory;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        DelayMessageManager manager = delayMessageFactory.getManager("redission");
        Thread thread = new Thread(() -> {
            while (true){
                DelayMessage concumer = manager.concumer();
                System.out.println("consumer delay Element ="+concumer);
            }
        });
        thread.setDaemon(true);
        thread.start();
    }
}
