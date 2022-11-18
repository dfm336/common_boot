package com.dfm.boot.example.utils;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

/**
 * 导入数据 填充三方数据 event
 * @Author:fengming.dai
 */
public class SupplyThirdDataEvent extends ApplicationEvent {

    @Getter
    @Setter
    private Long taskId;

    public SupplyThirdDataEvent(Object source,Long taskId) {
        super(source);
        this.taskId = taskId;
    }
}
