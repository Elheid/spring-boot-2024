package com.students.demo;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import lombok.extern.log4j.Log4j2;
@Log4j2
public class MyBean1 implements MyInterface  {
    @Override
    public void doSomething() {
        /*Thread thread = new Thread(() -> {
            //log.info("Thread1 bean is initialized");
            //System.out.println
            log.info("Doing something in MyBean1");
        });
        thread.start();*/
        //log.info("Doing something in MyBean1");
    }
    @PostConstruct
    public void postConstruct() {
        log.info("MyBean1 bean is initialized");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("MyBean1 bean is destroyed");
    }

}


