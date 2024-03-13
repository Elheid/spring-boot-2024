package com.students.demo;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import lombok.extern.log4j.Log4j2;
@Log4j2
public class MyBean1 implements MyInterface  {
    @Override
    public void doSomething() {
        Thread thread = new Thread(() -> {
            System.out.println("Thread1 bean is initialized");
            System.out.println("Doing something in MyBean1");
        });
        thread.start();

        //System.out.println("Doing something in MyBean1");
    }
}


