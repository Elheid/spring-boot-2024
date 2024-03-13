package com.students.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
public class MyService {


    private MyBean2 myBean2;
    //DI через поле
    @Autowired
    private MyBean1 myBean1;

   // DI через конструктор
    @Autowired
    public MyService(MyBean2 myBean2) {
        this.myBean2 = myBean2;
    }
/*
    // DI через setter
    @Autowired
    public void setMyService2(MyService2 service) {
        this.service = service;
    }*/


/*    @PostConstruct
    public void postConstruct() {
        System.out.println("MyService bean is initialized");

    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("MyService bean is destroyed");
    }*/
    public void doSomething() {
        System.out.println("Service ding smth");
        myBean1.doSomething();
        myBean2.doSomething();
    }
}