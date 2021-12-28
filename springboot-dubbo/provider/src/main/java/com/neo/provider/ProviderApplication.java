package com.neo.provider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;


@SpringBootApplication
// This annotation have the Dubbo work
@EnableDubboConfiguration
public class ProviderApplication {

    public static void main(String[] args) throws IOException {
       SpringApplication.run(ProviderApplication.class, args);
    }

}
