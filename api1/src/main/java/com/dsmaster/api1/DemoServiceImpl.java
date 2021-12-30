package com.dsmaster.api1;


import com.dsmaster.core.DemoService;

import org.springframework.stereotype.Component;

@Component

public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String msg) {

        String responseMsg = msg + "is so cool, you are hot！";
        // We can see what is going on in the api1
        System.out.println(responseMsg);

        return responseMsg;
    }
}