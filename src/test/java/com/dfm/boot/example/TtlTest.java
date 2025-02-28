package com.dfm.boot.example;

import com.alibaba.ttl.TransmittableThreadLocal;

/**
 * @author daifengming
 */
public class TtlTest {
    public static void main(String[] args) throws InterruptedException {
//        String replaceOrderId = replaceOrderId(" http://43.136.39.79:9099/callback-api/tds/callBack/cdsc/platformOrderId", "123456");
//        System.out.println("replaceOrderId = " + replaceOrderId);
        TransmittableThreadLocal<String> ttl = new TransmittableThreadLocal<>();

        // 在父线程中设置值
        ttl.set("父线程值");

        // 创建子线程
        Thread childThread = new Thread(() -> {
            System.out.println("子线程 remove之前："+ttl.get()); // 输出: 父线程值
            ttl.remove();
            System.out.println("子线程 remove之后："+ttl.get());
        });

        // 启动子线程
        childThread.start();
        System.out.println("父线程remove之前："+ttl.get());

        // 在父线程中移除值
//        ttl.remove();

        // 再次在子线程中访问
        childThread.join(); // 等待子线程完成
        System.out.println("子线程完成，父线程不remove之后："+ttl.get()); // 输出: 父线程值（子线程中的副本仍然存在）

    }

    /**
     *  将字符串中的 {orderid} 用 字符串 platformOrderId 替换
     */
    public static String replaceOrderId(String str, String replaceStr,String target) {
        return str.replaceAll(replaceStr, target);
    }
}
