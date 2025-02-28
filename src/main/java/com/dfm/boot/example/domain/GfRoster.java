package com.dfm.boot.example.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "gf_roster")
public class GfRoster {
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

    public static final String ID = "id";

    public static final String DB_ID = "id";

    public static final String ORG_CODE = "orgCode";

    public static final String DB_ORG_CODE = "org_code";

    public static final String ORG_NAME = "orgName";

    public static final String DB_ORG_NAME = "org_name";

    public static final String CREATE_TIME = "createTime";

    public static final String DB_CREATE_TIME = "create_time";

    public static final String MODIFY_TIME = "modifyTime";

    public static final String DB_MODIFY_TIME = "modify_time";

    public static final String CONTACT_PHONE = "contactPhone";

    public static final String DB_CONTACT_PHONE = "contact_phone";

    public static final String CONTACT_NAME = "contactName";

    public static final String DB_CONTACT_NAME = "contact_name";

    public static final String AMOUNT_COUNT = "amountCount";

    public static final String DB_AMOUNT_COUNT = "amount_count";

    public static final String INVOICING_AMOUNT = "invoicingAmount";

    public static final String DB_INVOICING_AMOUNT = "invoicing_amount";

    public static final String ORDER_COUNT = "orderCount";

    public static final String DB_ORDER_COUNT = "order_count";

    public static final String TIME_LIMIT = "timeLimit";

    public static final String DB_TIME_LIMIT = "time_limit";

    public static final String LOAN_RULE = "loanRule";

    public static final String DB_LOAN_RULE = "loan_rule";

    public static final String ORG_BRANCH = "orgBranch";

    public static final String DB_ORG_BRANCH = "org_branch";

    public static final String PAYMENT_TOTAL_3M = "paymentTotal3m";

    public static final String DB_PAYMENT_TOTAL_3M = "payment_total_3m";

    public static final String CASH_PAYMENT_RATIO_3M = "cashPaymentRatio3m";

    public static final String DB_CASH_PAYMENT_RATIO_3M = "cash_payment_ratio_3m";

    public static final String BANK_NOTE_RATIO_3M = "bankNoteRatio3m";

    public static final String DB_BANK_NOTE_RATIO_3M = "bank_note_ratio_3m";

    public static final String MERCHANT_PAPER_RATIO_3M = "merchantPaperRatio3m";

    public static final String DB_MERCHANT_PAPER_RATIO_3M = "merchant_paper_ratio_3m";

    public static final String CASH_PAYMENT_RATIO_12M = "cashPaymentRatio12m";

    public static final String DB_CASH_PAYMENT_RATIO_12M = "cash_payment_ratio_12m";

    public static final String BANK_NOTE_RATIO_12M = "bankNoteRatio12m";

    public static final String DB_BANK_NOTE_RATIO_12M = "bank_note_ratio_12m";

    public static final String MERCHANT_PAPER_RATIO_12M = "merchantPaperRatio12m";

    public static final String DB_MERCHANT_PAPER_RATIO_12M = "merchant_paper_ratio_12m";

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return org_code
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * @param orgCode
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    /**
     * @return org_name
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * @param orgName
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return modify_time
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * @param modifyTime
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取联系方式
     *
     * @return contact_phone - 联系方式
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * 设置联系方式
     *
     * @param contactPhone 联系方式
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    /**
     * 获取联系人
     *
     * @return contact_name - 联系人
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * 设置联系人
     *
     * @param contactName 联系人
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * 获取申请企业近12个月在核心企业订单金额合计
     *
     * @return amount_count - 申请企业近12个月在核心企业订单金额合计
     */
    public String getAmountCount() {
        return amountCount;
    }

    /**
     * 设置申请企业近12个月在核心企业订单金额合计
     *
     * @param amountCount 申请企业近12个月在核心企业订单金额合计
     */
    public void setAmountCount(String amountCount) {
        this.amountCount = amountCount;
    }

    /**
     * 获取申请企业近12个月在核心企业开票金额
     *
     * @return invoicing_amount - 申请企业近12个月在核心企业开票金额
     */
    public String getInvoicingAmount() {
        return invoicingAmount;
    }

    /**
     * 设置申请企业近12个月在核心企业开票金额
     *
     * @param invoicingAmount 申请企业近12个月在核心企业开票金额
     */
    public void setInvoicingAmount(String invoicingAmount) {
        this.invoicingAmount = invoicingAmount;
    }

    /**
     * 获取申请企业近12个月在核心企业订单数量合计
     *
     * @return order_count - 申请企业近12个月在核心企业订单数量合计
     */
    public String getOrderCount() {
        return orderCount;
    }

    /**
     * 设置申请企业近12个月在核心企业订单数量合计
     *
     * @param orderCount 申请企业近12个月在核心企业订单数量合计
     */
    public void setOrderCount(String orderCount) {
        this.orderCount = orderCount;
    }

    /**
     * 获取申请企业加入核心企业产业链限时
     *
     * @return time_limit - 申请企业加入核心企业产业链限时
     */
    public String getTimeLimit() {
        return timeLimit;
    }

    /**
     * 设置申请企业加入核心企业产业链限时
     *
     * @param timeLimit 申请企业加入核心企业产业链限时
     */
    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit;
    }

    /**
     * 获取贷前规则
     *
     * @return loan_rule - 贷前规则
     */
    public String getLoanRule() {
        return loanRule;
    }

    /**
     * 设置贷前规则
     *
     * @param loanRule 贷前规则
     */
    public void setLoanRule(String loanRule) {
        this.loanRule = loanRule;
    }

    /**
     * 获取所属分厂
     *
     * @return org_branch - 所属分厂
     */
    public String getOrgBranch() {
        return orgBranch;
    }

    /**
     * 设置所属分厂
     *
     * @param orgBranch 所属分厂
     */
    public void setOrgBranch(String orgBranch) {
        this.orgBranch = orgBranch;
    }

    /**
     * 获取申请企业近3个月在核心企业支付总金额
     *
     * @return payment_total_3m - 申请企业近3个月在核心企业支付总金额
     */
    public String getPaymentTotal3m() {
        return paymentTotal3m;
    }

    /**
     * 设置申请企业近3个月在核心企业支付总金额
     *
     * @param paymentTotal3m 申请企业近3个月在核心企业支付总金额
     */
    public void setPaymentTotal3m(String paymentTotal3m) {
        this.paymentTotal3m = paymentTotal3m;
    }

    /**
     * 获取申请企业近3个月在核心企业现金支付占比
     *
     * @return cash_payment_ratio_3m - 申请企业近3个月在核心企业现金支付占比
     */
    public String getCashPaymentRatio3m() {
        return cashPaymentRatio3m;
    }

    /**
     * 设置申请企业近3个月在核心企业现金支付占比
     *
     * @param cashPaymentRatio3m 申请企业近3个月在核心企业现金支付占比
     */
    public void setCashPaymentRatio3m(String cashPaymentRatio3m) {
        this.cashPaymentRatio3m = cashPaymentRatio3m;
    }

    /**
     * 获取申请企业近3个月在核心企业银票支付占比
     *
     * @return bank_note_ratio_3m - 申请企业近3个月在核心企业银票支付占比
     */
    public String getBankNoteRatio3m() {
        return bankNoteRatio3m;
    }

    /**
     * 设置申请企业近3个月在核心企业银票支付占比
     *
     * @param bankNoteRatio3m 申请企业近3个月在核心企业银票支付占比
     */
    public void setBankNoteRatio3m(String bankNoteRatio3m) {
        this.bankNoteRatio3m = bankNoteRatio3m;
    }

    /**
     * 获取申请企业近3个月在核心企业商票支付占比
     *
     * @return merchant_paper_ratio_3m - 申请企业近3个月在核心企业商票支付占比
     */
    public String getMerchantPaperRatio3m() {
        return merchantPaperRatio3m;
    }

    /**
     * 设置申请企业近3个月在核心企业商票支付占比
     *
     * @param merchantPaperRatio3m 申请企业近3个月在核心企业商票支付占比
     */
    public void setMerchantPaperRatio3m(String merchantPaperRatio3m) {
        this.merchantPaperRatio3m = merchantPaperRatio3m;
    }

    /**
     * 获取申请企业近12个月在核心企业现金支付占比
     *
     * @return cash_payment_ratio_12m - 申请企业近12个月在核心企业现金支付占比
     */
    public String getCashPaymentRatio12m() {
        return cashPaymentRatio12m;
    }

    /**
     * 设置申请企业近12个月在核心企业现金支付占比
     *
     * @param cashPaymentRatio12m 申请企业近12个月在核心企业现金支付占比
     */
    public void setCashPaymentRatio12m(String cashPaymentRatio12m) {
        this.cashPaymentRatio12m = cashPaymentRatio12m;
    }

    /**
     * 获取申请企业近12个月在核心企业银票支付占比
     *
     * @return bank_note_ratio_12m - 申请企业近12个月在核心企业银票支付占比
     */
    public String getBankNoteRatio12m() {
        return bankNoteRatio12m;
    }

    /**
     * 设置申请企业近12个月在核心企业银票支付占比
     *
     * @param bankNoteRatio12m 申请企业近12个月在核心企业银票支付占比
     */
    public void setBankNoteRatio12m(String bankNoteRatio12m) {
        this.bankNoteRatio12m = bankNoteRatio12m;
    }

    /**
     * 获取申请企业近12个月在核心企业商票支付占比
     *
     * @return merchant_paper_ratio_12m - 申请企业近12个月在核心企业商票支付占比
     */
    public String getMerchantPaperRatio12m() {
        return merchantPaperRatio12m;
    }

    /**
     * 设置申请企业近12个月在核心企业商票支付占比
     *
     * @param merchantPaperRatio12m 申请企业近12个月在核心企业商票支付占比
     */
    public void setMerchantPaperRatio12m(String merchantPaperRatio12m) {
        this.merchantPaperRatio12m = merchantPaperRatio12m;
    }
}
