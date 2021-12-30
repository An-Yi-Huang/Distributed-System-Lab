package com.dsmaster.controller;
import com.alibaba.dubbo.config.annotation.Reference;
import com.dsmaster.core.DemoService;
import com.dsmaster.core.GoodByeService;
import com.dsmaster.core.ProductInfo;
import com.dsmaster.core.ServiceCategory;
import org.springframework.stereotype.Component;

@Component
public class ProxyService {

    // this annotation can help us get the service
    @Reference(interfaceClass = DemoService.class,check = false)
    private DemoService demoService;

    @Reference(interfaceClass = GoodByeService.class,check = false)
    private GoodByeService goodByeService;

    @Reference(interfaceClass = ServiceCategory.class,check = false)
    private ServiceCategory serviceCategory;

    public String sayHello(String msg) {
        return demoService.sayHello(msg);
    }

    public String goodBye(String msg) {
        return goodByeService.goodBye(msg);
    }

    public ProductInfo[] getProductCategory(ProductInfo[] products, String category) {
        return serviceCategory.getProductCategory(products, category);
    }

}