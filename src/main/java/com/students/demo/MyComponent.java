package com.students.demo;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class MyComponent {

    private MyInterface service;

    //DI через поле
    @Autowired
    @Qualifier("myService2")
    private MyInterface service2;

   // DI через конструктор
    @Autowired
    public MyComponent(@Qualifier("myService1")MyInterface service) {
        this.service = service;
        service.doSomething();
    }
/*
    // DI через setter
    @Autowired
    public void setMyService2(MyService2 service) {
        this.service = service;
    }*/

/*
    @PostConstruct
    public void postConstruct() {
        System.out.println("MyService bean is initialized");

    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("MyService bean is destroyed");


    }*/
    public void doSomething() {
        service.doSomething();
    }
}