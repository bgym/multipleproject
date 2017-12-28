package com.yummy.bo.boservice.ordersvc;

import com.yummy.object.object.domin.Order;
import com.yummy.object.object.domin.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImp implements OrderService {
    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order queryById(String id) {

        return orderRepository.findOne(id);
    }

    @Override
    public List<Order> queryAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order save(Order order) {
        idEnsure(order);
        return orderRepository.save(order);
    }

    @Override
    public void delete(String id) {
        orderRepository.delete(id);
    }
}
