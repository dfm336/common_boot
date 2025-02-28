package com.dfm.boot.example.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "jd_apply_record")
public class JdApplyRecord {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "credit_code")
    private String creditCode;

    @Column(name = "gmt_create")
    private Date gmtCreate;

    @Column(name = "indictior")
    private String indictior;

    public static final String ID = "id";

    public static final String DB_ID = "id";

    public static final String CREDIT_CODE = "creditCode";

    public static final String DB_CREDIT_CODE = "credit_code";

    public static final String GMT_CREATE = "gmtCreate";

    public static final String DB_GMT_CREATE = "gmt_create";

    public static final String INDICTIOR = "indictior";

    public static final String DB_INDICTIOR = "indictior";

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
     * @return credit_code
     */
    public String getCreditCode() {
        return creditCode;
    }

    /**
     * @param creditCode
     */
    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    /**
     * @return gmt_create
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * @param gmtCreate
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * @return indictior
     */
    public String getIndictior() {
        return indictior;
    }

    /**
     * @param indictior
     */
    public void setIndictior(String indictior) {
        this.indictior = indictior;
    }
}