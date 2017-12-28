package com.yummy.bo.boservice.productsvc;

import com.yummy.object.object.domin.Product;
import com.yummy.object.object.domin.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public Product queryById(String id) {
        return productRepository.findOne(id);
    }

    @Override
    public List<Product> queryAll() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        idEnsure(product);

        return productRepository.save(product) ;
    }

    @Override
    public void delete(String id) {
        productRepository.delete(id);
    }
}
