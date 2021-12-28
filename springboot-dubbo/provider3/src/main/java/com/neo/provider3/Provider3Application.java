package com.neo.provider3;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class Provider3Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider3Application.class, args);
    }

}
