package com.students.demo;
import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Configuration
public class MyConfig {

    @Bean
    public MyBean1 bean1() {
        MyBean1 bean = new MyBean1();
        bean.doSomething();
        return bean;
    }
    @PostConstruct
    public void postConstruct() {
        System.out.println("MyBean1 bean is initialized");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("MyBean1 bean is destroyed");
    }

}
