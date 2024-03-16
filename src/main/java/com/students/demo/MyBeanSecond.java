package com.students.demo;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class MyBeanSecond implements MyInterface  {

    @Override
    public void doSomething() {
        log.info("Doing something in bean" );
    }
    @PostConstruct
    public void postConstruct() {
        log.info("MyBean2 bean is initialized");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("MyBean2 bean is destroyed");
    }

}

