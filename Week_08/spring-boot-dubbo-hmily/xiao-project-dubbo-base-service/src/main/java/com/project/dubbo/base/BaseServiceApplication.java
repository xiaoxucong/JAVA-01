package com.project.dubbo.base;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.dromara.hmily.spring.annotation.RefererAnnotationBeanPostProcessor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@EnableDubbo
@SpringBootApplication
@MapperScan(basePackages = {"com.project.dubbo.base.dao"} )
public class BaseServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseServiceApplication.class, args);
    }
    @Bean
    public BeanPostProcessor refererAnnotationBeanPostProcessor() {
        return new RefererAnnotationBeanPostProcessor();
    }
}
