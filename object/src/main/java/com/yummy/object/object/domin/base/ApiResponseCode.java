package com.yummy.object.object.domin.base;

public class ApiResponseCode {
    public static final String ERROR_MESSAGE = "访问错误";
    public static final long SUCCESS_CODE = 10000L;
    public static final String ACCESS_DENY_MESSAGE = "无权限";
    public static final String NEED_TOKEN_MESSAGE = "未登录";
    public static final long ERROR_CODE = 10001L;
    public static final String SUCCESS_MESSAGE = "访问成功";
    public static final long ACCESS_DENY_CODE = 10003L;
    public static final long NEED_TOKEN_CODE = 10002L;

    public ApiResponseCode() {
    }
}
