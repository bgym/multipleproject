package com.yummy.object.object.domin;

import com.yummy.object.object.domin.base.BaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Product extends BaseModel {

    @Column(nullable = false,name = "product_name")
    private String productName;
    @Column(nullable = false,name = "product_type")
    private String productType;
    @Column(nullable = false,name = "product_detail")
    private String productDetail;
    @Column(nullable = false,name = "product_price")
    private double productPrice;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductPrice() {
        return productPrice;
    }

}
