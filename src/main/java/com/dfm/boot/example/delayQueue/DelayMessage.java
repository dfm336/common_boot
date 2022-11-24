package com.dfm.boot.example.delayQueue;

import lombok.Data;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/**
 * @Author:fengming.dai
 */
@Data
public class DelayMessage implements Serializable {
    private final static long serialVersionUUid = 9006297630420423520L;

    String content;

    Long expire;

    TimeUnit unit;
}
