package com.dfm.boot.example.helper.excel;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

/**
 * 导入数据 event
 * @Author:fengming.dai
 */
public class ExcelDataEvent extends ApplicationEvent {

    @Getter
    @Setter
    private Long taskId;

    public ExcelDataEvent(Object source, Long taskId) {
        super(source);
        this.taskId = taskId;
    }
}
