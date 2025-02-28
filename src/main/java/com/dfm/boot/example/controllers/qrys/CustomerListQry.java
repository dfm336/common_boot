package com.dfm.boot.example.controllers.qrys;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author daifengming
 */
@Data
public class CustomerListQry {
    /**
     * 客户名称
     */
    private String customerName;

    /**
     *  时间筛选开始
     */
    private Date startTime;

    /**
     *  时间筛选结束
     */
    private Date endTime;

    /**
     * 所属核企，可多选
     */
    private List<Byte> coreEntTypes;

    /**
     * 营销状态
     */
    private Integer marketingStatus;

}
