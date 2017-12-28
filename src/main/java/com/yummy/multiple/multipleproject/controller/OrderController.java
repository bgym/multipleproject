package com.yummy.multiple.multipleproject.controller;

import com.yummy.bo.boservice.ordersvc.OrderService;
import com.yummy.object.object.domin.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orderSvc")
public class OrderController {

    @Autowired
    OrderService orderSvc;
    @RequestMapping(path = "/save",method = RequestMethod.POST)
    public Order save(@RequestBody Order order){
        return   orderSvc.save(order);

    }
}
