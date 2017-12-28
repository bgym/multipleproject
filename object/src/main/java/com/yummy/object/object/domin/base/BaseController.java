package com.yummy.object.object.domin.base;

import com.alibaba.fastjson.JSON;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BaseController {

    protected Logger logger;


    protected ApiResponse callbackFail(Map<String, Object> a) {
        return new ApiResponse(new ApiResponseState(10001L, "访问错误"), JSON.toJSONString(a));
    }

    protected ApiResponse callbackSuccess(String a) {
        if (StringUtils.isNotBlank(a)) {
            try {
                JSON.parseObject(a, Object.class);
            } catch (Exception var3) {
                HashMap var2 = new HashMap();
                var2.put("数据异常", a);
                return this.callbackSuccess((Map)var2);
            }
        }

        return new ApiResponse(new ApiResponseState(10000L, "访问成功"), a);
    }
    protected ApiResponse callbackSuccess(Map<String, Object> a) {
        String var2 = "";
        if (a != null) {
            var2 = JSON.toJSONString(a);
        }

        return this.callbackSuccess(var2);
    }
    protected ApiResponse callbackSuccess(List a) {
       String data="";
        if (CollectionUtils.isNotEmpty(a)) {
            data = ((List)a.parallelStream().map((ax) -> {
                try {
                    return JSON.toJSONString(ax);
                } catch (Exception var2) {
                   return "";
                }
            }).filter((ax) -> {
                return StringUtils.isNotBlank(ax.toString());
            }).collect(Collectors.toList())).toString();
        }

        return new ApiResponse(new ApiResponseState(10000L, "访问成功"), data.toString());
    }
}
