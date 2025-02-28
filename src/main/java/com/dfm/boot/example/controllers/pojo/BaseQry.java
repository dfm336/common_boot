package com.dfm.boot.example.controllers.pojo;

import lombok.Data;

/**
 * @Author:fengming.dai
 */
@Data
public class BaseQry {
    public static final Integer DEFAULT_PAGE = 1;
    public static final Integer DEFAULT_PAGE_SIZE = 10;

    Integer page = DEFAULT_PAGE;

    Integer pageSize = DEFAULT_PAGE_SIZE;

}
