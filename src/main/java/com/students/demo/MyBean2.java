package com.students.demo;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import lombok.extern.log4j.Log4j2;
@Log4j2
public class MyBean2 implements MyInterface  {
    @Override
    public void doSomething() {
        Thread thread = new Thread(() -> {
            System.out.println("Thread2 bean is initialized");
            System.out.println("Doing something in MyBean2");
        });
        thread.start();
    }
}

