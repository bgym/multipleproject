package com.yummy.object.object.domin.base;


public class ApiResponseState {
    private String message;
    private long code;
    private long timestamp;

    public String getErrMsg() {
        return this.message;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setErrCode(long a) {
        this.code = a;
    }

    public long getErrCode() {
        return this.code;
    }

    public void setErrMsg(String a) {
        this.message = a;
    }

    public void setTimestamp(long a) {
        this.timestamp = a;
    }

    public ApiResponseState(long code, String message) {
        this.message = message;
        this.code = code;
        this.timestamp = System.currentTimeMillis();
    }

    public ApiResponseState(long code, String message, long timestamp) {
        this.code = code;
        this.message = message;
        this.timestamp = timestamp;
    }
}
