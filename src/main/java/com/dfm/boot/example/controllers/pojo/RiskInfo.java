package com.dfm.boot.example.controllers.pojo;

import lombok.Data;

/**
 * @author daifengming
 */
@Data
public class RiskInfo {
    /**
     * 风险项
     */
    private String riskName;
    /**
     * 风险触碰规则
     */
    private String riskRule;
    /**
     * 规则释义
     */
    private String riskDesc;
}
