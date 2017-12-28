package com.yummy.bosvcservice.ordersvc;

import com.alibaba.fastjson.JSON;
import com.yummy.bo.boservice.ordersvc.OrderService;
import com.yummy.bosvcservice.ordersvc.domin.OrderSvcModel;
import com.yummy.object.object.domin.Order;
import com.yummy.object.object.domin.base.ApiResponse;
import com.yummy.object.object.domin.base.ApiResponseCode;
import com.yummy.object.object.domin.base.ApiResponseState;
import com.yummy.object.object.domin.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/orderSvc")
public class OrderSvcController extends BaseController {
    @Autowired
    OrderSvc orderSvc;
    @RequestMapping(value = "/getOne/{id}",method = RequestMethod.GET)
    public ApiResponse save(@PathVariable String id){
        OrderSvcModel orderSvcModel=orderSvc.queryById(id);
        return   new ApiResponse(new ApiResponseState(ApiResponseCode.SUCCESS_CODE,ApiResponseCode.SUCCESS_MESSAGE), JSON.toJSONString(orderSvcModel));

    }
}
