package com.yummy.object.object.domin;

import com.yummy.object.object.domin.base.BaseModel;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="mk_order")
public class Order extends BaseModel {

    @Column(nullable = false,name = "order_type")
    private String orderType;
    @Column(nullable = false,name = "order_name")
    private String orderName;
    @Column(nullable = false,name = "order_price")
    private double orderPrice;
    @Column(nullable = false,name = "product_count")
    private int productCount;
    @Column(nullable = false,name = "product_id")
    private String productId;

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public String getProductId() {
        return productId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public int getProductCount() {
        return productCount;
    }
}
