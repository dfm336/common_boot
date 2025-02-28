package com.dfm.boot.example.controllers.vos;

import lombok.Data;

/**
 * @author daifengming
 */
@Data
public class CustomerStatisticsVO {
    /**
     * 总客户数
     */
    private Integer total;
    /**
     * 已营销数
     */
    private Integer marketing;
    /**
     * 待营销数
     */
    private Integer noMarketing;
}
