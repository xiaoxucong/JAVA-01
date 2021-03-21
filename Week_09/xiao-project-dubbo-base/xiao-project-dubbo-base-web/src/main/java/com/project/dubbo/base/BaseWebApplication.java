package com.project.dubbo.base;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableDubbo
@SpringBootApplication
public class BaseWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseWebApplication.class, args);
    }

}
