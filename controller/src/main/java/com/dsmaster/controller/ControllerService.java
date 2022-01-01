package com.dsmaster.controller;

import java.util.List;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.dsmaster.core.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@EnableDubboConfiguration
@RestController
public class ControllerService {
    @Autowired ProxyService proxyservice;

    //api1
    @RequestMapping(value="/product/{id}", method = RequestMethod.GET)
    public ProductInfo productContent(@PathVariable("id") int id){
        return proxyservice.getProductContent(id);
    }

    //api2
    @RequestMapping(value="/", method = RequestMethod.GET)
    public List<ProductInfo> RecommendationProducts(){
        return proxyservice.getRecommendationProducts();
    }

    // api4
    @RequestMapping(value="/search", method = RequestMethod.GET)
    public List<ProductInfo> search(@PathVariable("msg") String msg){
        return proxyservice.searchProduct(msg);
    }
}
