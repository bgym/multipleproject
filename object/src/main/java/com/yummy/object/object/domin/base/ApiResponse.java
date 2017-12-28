package com.yummy.object.object.domin.base;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class ApiResponse {

    private ApiResponseState apiResponseState;
    private Object data;


    public ApiResponse(ApiResponseState apiResponseState, String data) {
        this.apiResponseState=apiResponseState;
        if(StringUtils.isBlank(data)){
            HashMap apiData=new HashMap();
            this.data=apiData;
        }else{
            this.data= JSON.parseObject(data, Object.class);
        }

    }
    public ApiResponse(ApiResponseState apiResponseState, HashMap<String, Object> data) {
        this.apiResponseState=apiResponseState;
        if(data==null){
            HashMap apiData=new HashMap();
            this.data=apiData;
        }else{
            this.data=data;
        }

    }

    public ApiResponseState getApiResponseState() {
        return apiResponseState;
    }

    public void setApiResponseState(ApiResponseState apiResponseState) {
        this.apiResponseState = apiResponseState;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
