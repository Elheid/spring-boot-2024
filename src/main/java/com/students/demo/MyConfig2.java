package com.students.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig2 {

    @Bean
    public MyBean2 bean2() {
        MyBean2 bean = new MyBean2();
        bean.doSomething();
        return bean;
    }
    @PostConstruct
    public void postConstruct() {
        System.out.println("MyBean2 bean is initialized");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("MyBean2 bean is destroyed");
    }

/*    @Bean
    @Scope(value = "singleton")
    public MyBean2 bean2() {
        MyBean2 bean = new MyBean2();
        bean.doSomething();
        return bean;
    }*/

}
