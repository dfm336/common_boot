package com.dfm.boot.example.helper.excel;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author:fengming.dai
 */
@Configuration
@EnableAsync
public class ExcelAsyncConfig {

    @Bean("ExcelDealPool")
    public Executor getExecutor(){
        // i/o 密集型
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors+1, 2*availableProcessors, 30, TimeUnit.SECONDS,
                    new LinkedBlockingQueue<>(20),
                    new ThreadFactoryBuilder().setNameFormat("ExcelDealPool-Thread-%d").build(),
                    new ThreadPoolExecutor.CallerRunsPolicy()
        );
        return threadPoolExecutor;
    }
    }