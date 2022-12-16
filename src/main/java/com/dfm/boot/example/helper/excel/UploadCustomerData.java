package com.dfm.boot.example.helper.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 完整的  客户信息（excel 的一条记录）
 *
 * @Author:fengming.dai
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class UploadCustomerData {
    /**
     * 项目名称
     */
    @ExcelProperty("项目名称")
    @Column(name = "project_name")
    private String projectName;

    /**
     * 部门名称
     */
    @ExcelProperty("部门")
    @Column(name = "dept_name")
    private String deptName;

    /**
     * 放款金额
     */
    @ExcelProperty("放款金额")
    @Column(name = "amount")
    private BigDecimal amount;

    /**
     * IRR
     */
    @ExcelProperty("IRR")
    @Column(name = "IRR")
    private String irr;

    /**
     * 五级分类
     */
    @ExcelProperty("五级分类")
    @Column(name = "type")
    private String type;

    /**
     * 承租人
     */
    @ExcelProperty("承租人")
    @Column(name = "renter")
    private String renter;

    /**
     * 省份
     */
    @ExcelProperty("省份")
    @Column(name = "province")
    private String province;

    /**
     * 授信金额
     */
    @ExcelProperty("授信金额")
    @Column(name = "credit_amount")
    private BigDecimal creditAmount;

    @ExcelProperty("立项时间")
    @DateTimeFormat("yyyy-MM-dd")
    private Date gmtCreate;

}
