package com.dsmaster.controller;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@EnableDubboConfiguration
@SpringBootApplication
public class ControllerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ControllerApplication.class, args);
        applicationContext.start();
        // we can print the msg here

        // Object demoService = applicationContext.getBean("DemoService");

        ProxyService thirdService = applicationContext.getBean(ProxyService.class);

        String responseMsg = thirdService.sayHello("Consumer：");
        String msg2 = thirdService.goodBye("I love u, ");
        System.err.println(responseMsg);
        System.err.println(msg2);
        System.out.println("start.....");
    }

}
