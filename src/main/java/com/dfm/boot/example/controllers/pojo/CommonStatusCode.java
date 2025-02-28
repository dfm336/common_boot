package com.dfm.boot.example.controllers.pojo;

import lombok.AllArgsConstructor;

/**
 * @Author:fengming.dai
 */
@AllArgsConstructor
public enum CommonStatusCode implements StatusCode {
    PARAM_ERROR(400, "参数异常"),
    BAD_REQUEST(400, "异常请求"),
    FORBIDDEN(403, "无权限"),
    SYSTEM_ERROR(500, "系统错误"),
    DATABASE_OPERATE_FAILURE(10000, "数据库操作失败"),
    NEXT_AUDIT_USER_IS_BLANK(10001, "下一审批人不允许为空"),
    USER_ORG_NOT_EXIST(10002, "用户所属机构不存在"),

    NO_RECORD(404, "未查询到结果"),

    OK(200,"OK")
    ;


    private final int code;
    private final String message;


    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
