package com.dfm.boot.example.controllers.pojo;

import com.dfm.boot.example.controllers.cmd.MarketingCmd;

import java.util.List;

/**
 * @author daifengming
 */
public class CustomerInfo {
    /**
     * 客户名称
     */
    private String customerName;
    /**
     * 统一社会信用代码
     */
    private String creditCode;
    /**
     * 联系人
     */
    private String contactName;
    /**
     * 联系人电话
     */
    private String contactPhone;
    /**
     * 法人姓名
     */
    private String legalName;
    /**
     * 法人电话
     */
    private String legalPhone;
    /**
     * 经营地址
     */
    private String address;
    /**
     * 所属行业
     */
    private String industry;
    /**
     * 营销信息
     */
    private List<MarketingCmd> marketingCmds;

    /**
     * 风险评估信息
     */
    private List<RiskInfo> riskInfos;
}
