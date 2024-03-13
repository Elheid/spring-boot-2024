package com.students.demo;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class MyService {


    //DI через поле
   @Autowired
    private MyBean1 myBean1;

   // DI через конструктор

    private MyBean2 myBean3;
    @Autowired
    public MyService(MyBean2 myBean3) {
        this.myBean3 = myBean3;
        log.info("Произошла инициализация бина по конструктору");
    }

    // DI через setter
    private MyBean2 myBean2;
    @Autowired
    public void setMyService2(MyBean2 myBean2) {
        this.myBean2 = myBean2;
        log.info("Произошла инициализация бина через setter");
    }


/*    @PostConstruct
    public void postConstruct() {
        System.out.println("MyService bean is initialized");

    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("MyService bean is destroyed");
    }
*/
    public void doSomething() {
        System.out.println("Service ding smth");
        myBean1.doSomething();
        myBean2.doSomething();
        myBean3.doSomething();
    }
}