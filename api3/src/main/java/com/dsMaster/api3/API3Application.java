package com.dsMaster.api3;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class API3Application {

    public static void main(String[] args) {
        SpringApplication.run(API3Application.class, args);
    }

}
