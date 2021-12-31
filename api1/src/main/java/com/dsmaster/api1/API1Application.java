package com.dsmaster.api1;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;

@SpringBootApplication
@EnableDubboConfiguration
public class API1Application {
    public static void main(String[] args) throws IOException {
       SpringApplication.run(API1Application.class, args);
    }

}
