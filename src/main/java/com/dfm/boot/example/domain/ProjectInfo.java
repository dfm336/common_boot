package com.dfm.boot.example.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "project_info")
public class ProjectInfo {
    @Id
    @Column(name = "id")
    private Long id;

    /**
     * 项目名称
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * 部门名称
     */
    @Column(name = "dept_name")
    private String deptName;

    /**
     * 放款金额
     */
    @Column(name = "amount")
    private BigDecimal amount;

    /**
     * IRR
     */
    @Column(name = "IRR")
    private BigDecimal irr;

    /**
     * 五级分类
     */
    @Column(name = "type")
    private String type;

    /**
     * 承租人
     */
    @Column(name = "renter")
    private String renter;

    /**
     * 省份
     */
    @Column(name = "province")
    private String province;

    /**
     * 授信金额
     */
    @Column(name = "credit_amount")
    private BigDecimal creditAmount;

    /**
     * url详情
     */
    @Column(name = "url")
    private String url;

    /**
     * 立项时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    public static final String ID = "id";

    public static final String DB_ID = "id";

    public static final String PROJECT_NAME = "projectName";

    public static final String DB_PROJECT_NAME = "project_name";

    public static final String DEPT_NAME = "deptName";

    public static final String DB_DEPT_NAME = "dept_name";

    public static final String AMOUNT = "amount";

    public static final String DB_AMOUNT = "amount";

    public static final String IRR = "irr";

    public static final String DB_IRR = "IRR";

    public static final String TYPE = "type";

    public static final String DB_TYPE = "type";

    public static final String RENTER = "renter";

    public static final String DB_RENTER = "renter";

    public static final String PROVINCE = "province";

    public static final String DB_PROVINCE = "province";

    public static final String CREDIT_AMOUNT = "creditAmount";

    public static final String DB_CREDIT_AMOUNT = "credit_amount";

    public static final String URL = "url";

    public static final String DB_URL = "url";

    public static final String GMT_CREATE = "gmtCreate";

    public static final String DB_GMT_CREATE = "gmt_create";

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取项目名称
     *
     * @return project_name - 项目名称
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 设置项目名称
     *
     * @param projectName 项目名称
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * 获取部门名称
     *
     * @return dept_name - 部门名称
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置部门名称
     *
     * @param deptName 部门名称
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * 获取放款金额
     *
     * @return amount - 放款金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置放款金额
     *
     * @param amount 放款金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取IRR
     *
     * @return IRR - IRR
     */
    public BigDecimal getIrr() {
        return irr;
    }

    /**
     * 设置IRR
     *
     * @param irr IRR
     */
    public void setIrr(BigDecimal irr) {
        this.irr = irr;
    }

    /**
     * 获取五级分类
     *
     * @return type - 五级分类
     */
    public String getType() {
        return type;
    }

    /**
     * 设置五级分类
     *
     * @param type 五级分类
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取承租人
     *
     * @return renter - 承租人
     */
    public String getRenter() {
        return renter;
    }

    /**
     * 设置承租人
     *
     * @param renter 承租人
     */
    public void setRenter(String renter) {
        this.renter = renter;
    }

    /**
     * 获取省份
     *
     * @return province - 省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份
     *
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取授信金额
     *
     * @return credit_amount - 授信金额
     */
    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    /**
     * 设置授信金额
     *
     * @param creditAmount 授信金额
     */
    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    /**
     * 获取url详情
     *
     * @return url - url详情
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置url详情
     *
     * @param url url详情
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取立项时间
     *
     * @return gmt_create - 立项时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置立项时间
     *
     * @param gmtCreate 立项时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}