package com.dsmaster.controller;

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

    @RequestMapping(value="/product/{id}", method = RequestMethod.GET)
    public ProductInfo productContent(@PathVariable("id") int id){
        return proxyservice.getProductContent(id);
    }


}
