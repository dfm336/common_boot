package com.dfm.boot.example.controllers.pojo;

/**
 * @author hk
 * @date 2019/11/28 15:21
 */
public enum ReasonCodeEnum {

    SUCCESS("200","请求成功"),
    FAIL("201","请求失败"),
    PARAM_ERROR("100", "非法参数"),
    PARAM_NULL_ERROR("101", "缺少必要参数"),
    PRIMARYCODE_REPEAT("102", "录入信息重复"),
    ACCOUNT_NOT_EXIST("103", "该账号不存在，请重新输入"),
    USER_STATUS_DISABLE("104", "该账号已被禁用，请联系管理员"),
    USER_PASSWORD_ERROR("105", "账号或密码输入错误，请重试"),
    ILLEGAL_REQUEST("106", "非法请求"),
    ILLEGAL_TOKEN_REQUEST("107", "请重新登录"),
    EMAIL_FORMAT_REQUEST("108", "账号格式错误，请输入正确的邮箱"),
    MOBILE_FORMAT_REQUEST("109", "手机号格式错误，请输入正确的手机号"),
    PARTNERCODE_STATUS_DISABLE("110", "该合作方已被禁用，请联系管理员"),
    PASSWORD_EMPTY("111", "密码不能为空"),
    TOKEN_EXPIRE("112", "登录已失效"),
    PASSWORD_REPEAT("113", "密码重复，请重新设置"),
    VERIFICATION_CODE_EMPTY("114", "验证不能为空"),
    VERIFICATION_CODE_ERROR("115", "验证码输入错误，请重试"),
    EXIT_NAME_RESOURCE("116", "同级中已存在相同名称的资源"),
    EXIT_CODE_RESOURCE("117", "全局已存在相同code的资源"),
    DELETE_SON_RESOURCE("118", "请先删除子资源"),
    DELETE_ROLE_AND_RESOURCE("119", "请先回收关联角色中的该资源"),
    EXIT_NAME_ROLE("120", "已存在相同名称的角色"),
    DELETE_SON_ROLE("121", "请先删除子角色"),
    DELETE_ROLE_AND_USER("122", "请先回收关联用户中的该角色"),
    PARAM_TOO_LONG("123", "入参超过长度限制"),
    PASSWORD_INVALID("124", "密码不合法，应包含数字、字母、符号中至少两种，长度10位以上"),
    AUTH_FAILED("888", "无访问权限"),
    INTERNAL_ERROR("999","服务异常");

    private String code;
    private String desc;

    ReasonCodeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return this.code;
    }

    private void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return this.desc;
    }

    private void setDesc(String desc) {
        this.desc = desc;
    }

}
