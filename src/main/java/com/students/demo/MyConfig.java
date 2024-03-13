package com.students.demo;
import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;

@Configuration
@Log4j2
public class MyConfig {

    @Bean
    public MyBean1 bean1() {
        MyBean1 bean = new MyBean1();
        bean.doSomething();
        return bean;
    }
    @Bean
    public MyBean2 bean2() {
        MyBean2 bean = new MyBean2();
        bean.doSomething();
        return bean;
    }

}
