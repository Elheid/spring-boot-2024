package com.students.demo;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


@Component("myService2")
public class MyService2 implements MyInterface  {
    @Override
    public void doSomething() {
        System.out.println("Doing something in MyService2");
    }
    @PostConstruct
    public void postConstruct() {
        System.out.println("MyService2 bean is initialized");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("MyService2 bean is destroyed");
    }
}

