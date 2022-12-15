package com.dfm.boot.example;

import com.dfm.boot.example.delayQueue.DelayMessage;
import com.dfm.boot.example.delayQueue.manager.DelayMessageFactory;
import com.dfm.boot.example.delayQueue.manager.DelayMessageManager;
import com.dfm.boot.example.domain.Repository;
import com.dfm.boot.example.mappers.RepositoryMapper;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.redisson.Redisson;
import org.redisson.api.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Slf4j
@SpringBootTest
class RedissionTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    RedissonClient redissonClient;

    @Autowired
    DelayMessageFactory delayMessageFactory;

    public static final String lock = "retryLock";


    @Test
    public void testDistributionLock(){
        RLock lock = redissonClient.getLock(RedissionTests.lock);

        // 1. 普通加锁
//        lock.lock();
        // 2. 加锁后，指定时间内 自动 unlock
//        lock.lock(2000,TimeUnit.SECONDS);

        //3. 尝试加锁
//        lock.tryLock(2000,TimeUnit.SECONDS)
    }

    @Test
    public void test() throws InterruptedException {
        //这个queue 的目的是  延时到期的任务 放入该队列，通过消费该队列 完成 延时
        DelayMessageManager manager = delayMessageFactory.getManager("redission");
        DelayMessage msg = buildDelayMsg(5L);
        manager.add(msg);

        DelayMessage msg2 = buildDelayMsg(10L);
        manager.add(msg2);

        DelayMessage msg3 = buildDelayMsg(15L);
        manager.add(msg3);

        Thread.sleep(30*1000);

    }

    private DelayMessage buildDelayMsg(Long expire) {
        DelayMessage message = new DelayMessage();
        message.setContent("这是"+expire+"秒后的延时消息内容");
        message.setUnit(TimeUnit.SECONDS);
        message.setExpire(expire);
        return message;
    }

    public static void main(String[] args) {
        //默认连接  127.0.0.1 6379
        RedissonClient client = Redisson.create();

//        RList 继承了 java.util.List 接口
        RList<String> nameList = client.getList("nameList");
        nameList.clear();
        nameList.add("bingo");
        nameList.add("yanglbme");
        nameList.add("https://github.com/yanglbme");
        nameList.remove(-1);

        boolean contains = nameList.contains("yanglbme");
        System.out.println("List size: " + nameList.size());
        System.out.println("Is list contains name 'yanglbme': " + contains);
        nameList.forEach(System.out::println);

        client.shutdown();
    }

}
