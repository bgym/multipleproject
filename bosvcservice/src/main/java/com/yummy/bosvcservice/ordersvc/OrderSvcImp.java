package com.yummy.bosvcservice.ordersvc;

import com.yummy.bo.boservice.ordersvc.OrderService;
import com.yummy.bo.boservice.productsvc.ProductService;
import com.yummy.bosvcservice.ordersvc.domin.OrderSvcModel;
import com.yummy.object.object.domin.Order;
import com.yummy.object.object.domin.OrderRepository;
import com.yummy.object.object.domin.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderSvcImp implements OrderSvc {

    @Autowired
    OrderService orderService;
    @Autowired
    ProductService productService;

    @Override
    public void delete(String id) {

    }

    @Transactional
    @Override
    public OrderSvcModel save(OrderSvcModel orderSvcModel) {

        return null;
    }

    @Override
    public List<OrderSvcModel> queryAll() {
        return null;
    }

    @Override
    public OrderSvcModel queryById(String id) {
       Order order= orderService.queryById(id);
        Product product=productService.queryById(order.getProductId());
        OrderSvcModel orderSvcModel=new OrderSvcModel();
        orderSvcModel.setOrder(order);
        orderSvcModel.setProduct(product);
        return orderSvcModel;
    }
}
