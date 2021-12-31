package com.dsmaster.api1;


import com.dsmaster.core.ProductInfo;
import com.dsmaster.core.ProductList;
import com.dsmaster.core.ProductService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = ProductService.class)
public class ProductServiceImpl implements ProductService {
    @Override
    public ProductInfo getProductContent(int id) {
        for (ProductInfo product : ProductList.PRODUCTS) {
            if (product.getId() == id) return product;
        }
        return null;
    }
}