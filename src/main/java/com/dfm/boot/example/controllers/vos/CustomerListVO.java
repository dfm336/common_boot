package com.dfm.boot.example.controllers.vos;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author daifengming
 */
@Data
public class CustomerListVO {
    private Long id;
    /**
     * 客户名称
     */
    private String name;

    /**
     * 所属核企
     */
    private String coreEntName;

    /**
     * 推送时间
     */
    private Date pushTime;


    /**
     * 意愿分
     */
    private BigDecimal wishScore;

    /**
     * 新客标签
     * true:新客 false:老客
     */
    private Boolean newCustomerTag;
}
