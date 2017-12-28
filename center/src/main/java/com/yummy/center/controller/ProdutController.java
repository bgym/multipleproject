package com.yummy.center.controller;


import com.alibaba.fastjson.JSON;
import com.yummy.bo.boservice.productsvc.ProductService;
import com.yummy.object.object.domin.Product;
import com.yummy.object.object.domin.base.ApiResponse;
import com.yummy.object.object.domin.base.BaseController;
import com.yummy.object.object.domin.base.ModelValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;

@RestController
@RequestMapping("/product")
public class ProdutController extends BaseController {

    @Autowired
    ProductService productSvc;
    @RequestMapping(value = "/save",method = RequestMethod.POST)
   public ApiResponse save(@ModelAttribute Product product){

       /* String id=product.get("id");
        String productName=product.get("productName");
        String productDetail=product.get("productDetail");
        String productPrice=product.get("productPrice");
        String productType=product.get("productType");*/
        /*Product product1=new Product();
        //product1.setId("d699b1a7-37d5-4198-8a49-bbae7c294e4e");
        product1.setProductDetail("很好的拖鞋");
        product1.setProductName("拖鞋");
        product1.setProductPrice(22.22);
        product1.setProductType("1");*/
        HashMap<String,Object> list=(HashMap<String, Object>) ModelValidator.validate(product);
        if (list.size()>0){
            return super.callbackFail(list);
        }else {

            /*list.forEach((message)->{
                System.out.println(message);
            });*/
            return  super.callbackSuccess(JSON.toJSONString(productSvc.save(product)));
        }
        //return   productSvc.save(product1);

    }
}
