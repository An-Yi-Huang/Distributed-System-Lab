package com.dsMaster.controller;
import com.alibaba.dubbo.config.annotation.Reference;
import com.dsMaster.core.DemoService;
import com.dsMaster.core.GoodByeService;
import org.springframework.stereotype.Component;

@Component
public class ProxyService {

    // this annotation can help us get the service
    @Reference(interfaceClass = DemoService.class,check = false)
    private DemoService demoService;

    @Reference(interfaceClass = GoodByeService.class,check = false)
    private GoodByeService goodByeService;

    public String sayHello(String msg) {
        return demoService.sayHello(msg);
    }

    public String goodBye(String msg) {
        return goodByeService.goodBye(msg);
    }

}