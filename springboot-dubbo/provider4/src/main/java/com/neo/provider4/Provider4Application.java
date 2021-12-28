package com.neo.provider4;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class Provider4Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider4Application.class, args);
    }

}
