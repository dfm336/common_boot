package com.dfm.boot.example.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author daifengming
 */
@Data
public class BaseRoster {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "org_code")
    private String orgCode;

    @Column(name = "org_name")
    private String orgName;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 联系方式
     */
    @Column(name = "contact_phone")
    private String contactPhone;

    /**
     * 联系人
     */
    @Column(name = "contact_name")
    private String contactName;

    /**
     * 申请企业近12个月在核心企业订单金额合计
     */
    @Column(name = "amount_count")
    private String amountCount;

    /**
     * 申请企业近12个月在核心企业开票金额
     */
    @Column(name = "invoicing_amount")
    private String invoicingAmount;

    /**
     * 申请企业近12个月在核心企业订单数量合计
     */
    @Column(name = "order_count")
    private String orderCount;

    /**
     * 申请企业加入核心企业产业链限时
     */
    @Column(name = "time_limit")
    private String timeLimit;

    /**
     * 贷前规则
     */
    @Column(name = "loan_rule")
    private String loanRule;

    /**
     * 所属分厂
     */
    @Column(name = "org_branch")
    private String orgBranch;

    /**
     * 申请企业近3个月在核心企业支付总金额
     */
    @Column(name = "payment_total_3m")
    private String paymentTotal3m;

    /**
     * 申请企业近3个月在核心企业现金支付占比
     */
    @Column(name = "cash_payment_ratio_3m")
    private String cashPaymentRatio3m;

    /**
     * 申请企业近3个月在核心企业银票支付占比
     */
    @Column(name = "bank_note_ratio_3m")
    private String bankNoteRatio3m;

    /**
     * 申请企业近3个月在核心企业商票支付占比
     */
    @Column(name = "merchant_paper_ratio_3m")
    private String merchantPaperRatio3m;

    /**
     * 申请企业近12个月在核心企业现金支付占比
     */
    @Column(name = "cash_payment_ratio_12m")
    private String cashPaymentRatio12m;

    /**
     * 申请企业近12个月在核心企业银票支付占比
     */
    @Column(name = "bank_note_ratio_12m")
    private String bankNoteRatio12m;

    /**
     * 申请企业近12个月在核心企业商票支付占比
     */
    @Column(name = "merchant_paper_ratio_12m")
    private String merchantPaperRatio12m;

}
