package com.dfm.boot.example.domain;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;

@Data
@Table(name = "cyl_roster_all")
public class CylRosterAll extends BaseRoster{

    /**
     * 1:川仪 2:国复 3:宗申 4:机电
     */
    @Column(name = "core_ent_type")
    private Byte coreEntType;

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

    public static final String CORE_ENT_TYPE = "coreEntType";

    public static final String DB_CORE_ENT_TYPE = "core_ent_type";

}
