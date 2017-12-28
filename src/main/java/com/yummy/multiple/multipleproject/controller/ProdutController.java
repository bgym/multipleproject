package com.yummy.multiple.multipleproject.controller;


import com.yummy.bo.boservice.productsvc.ProductService;
import com.yummy.object.object.domin.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productSvc")
public class ProdutController {

    @Autowired
    ProductService productSvc;
    @RequestMapping(path = "/save",method = RequestMethod.POST)
   public Product save(@RequestBody Product product){

        return   productSvc.save(product);

    }
}
