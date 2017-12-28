package com.yummy.center.controller;

import com.alibaba.fastjson.JSON;
import com.yummy.bo.boservice.ordersvc.OrderService;
import com.yummy.object.object.domin.Order;
import com.yummy.object.object.domin.base.ApiResponse;
import com.yummy.object.object.domin.base.ApiResponseCode;
import com.yummy.object.object.domin.base.ApiResponseState;
import com.yummy.object.object.domin.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController extends BaseController{

    @Autowired
    OrderService orderService;
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public ApiResponse save(@ModelAttribute Order order){
         Order  order1=orderService.save(order);
        return  new ApiResponse(new ApiResponseState(ApiResponseCode.SUCCESS_CODE,ApiResponseCode.SUCCESS_MESSAGE), JSON.toJSONString(order1));

    }
}
