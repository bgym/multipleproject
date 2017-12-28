package com.yummy.bosvcservice.ordersvc.domin;

import com.yummy.object.object.domin.Order;
import com.yummy.object.object.domin.Product;
import com.yummy.object.object.domin.base.BaseModel;

public class OrderSvcModel extends BaseModel {
    private Order order;
    private Product product;

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public Product getProduct() {
        return product;
    }
}
