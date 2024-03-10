package com.students.demo;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import lombok.extern.log4j.Log4j2;
@Log4j2
@Component("myService1")
public class MyService1 implements MyInterface  {
    @Override
    public void doSomething() {
        System.out.println("Doing something in MyService1");
    }
    @PostConstruct
    public void postConstruct() {
        System.out.println("MyService1 bean is initialized");
        log.info("MyService1 bean is initialized");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("MyService1 bean is destroyed");
        log.info("MyService1 bean is destroyed");
    }
}


