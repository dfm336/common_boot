package com.dfm.boot.example.controllers.cmd;

import lombok.Data;

import java.util.List;

/**
 * @author daifengming
 */
@Data
public class CustomerCmd {
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
     * 营销信息
     */
    private List<MarketingCmd> marketingCmds;
}
