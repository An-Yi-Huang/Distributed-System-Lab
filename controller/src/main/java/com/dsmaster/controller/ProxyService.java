package com.dsmaster.controller;
import java.util.List;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dsmaster.core.DemoService;
import com.dsmaster.core.GoodByeService;
import com.dsmaster.core.HomePageService;
import com.dsmaster.core.ProductInfo;
import com.dsmaster.core.ProductService;
import com.dsmaster.core.ServiceCategory;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ProxyService {

    // this annotation can help us get the service
    @Reference(interfaceClass = DemoService.class,check = false)
    private DemoService demoService;

    @Reference(interfaceClass = GoodByeService.class,check = false)
    private GoodByeService goodByeService;

    @Reference(interfaceClass = ServiceCategory.class,check = false)
    private ServiceCategory serviceCategory;

    @Reference(interfaceClass = ProductService.class,check = false)
    private ProductService productService;

    @Reference(interfaceClass = HomePageService.class, check = false)
    private HomePageService homepageService;

    public String sayHello(String msg) {
        return demoService.sayHello(msg);
    }

    public String goodBye(String msg) {
        return goodByeService.goodBye(msg);
    }

    public ProductInfo[] getProductCategory(ProductInfo[] products, String category) {
        return serviceCategory.getProductCategory(products, category);
    }

    public ProductInfo getProductContent(int id) {
        return productService.getProductContent(id);
    }

    public List<ProductInfo> getRecommendationProducts(){
        return homepageService.getRecommendationProducts();
    }

}