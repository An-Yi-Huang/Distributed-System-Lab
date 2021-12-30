package com.dsmaster.api2;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class API2Application {

    public static void main(String[] args) {
        SpringApplication.run(API2Application.class, args);
    }

}
