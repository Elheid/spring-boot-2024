package com.students.demo.beans;

import com.students.demo.MyInterface;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import lombok.extern.log4j.Log4j2;

@Component
@Profile("test")
@Log4j2
public class MyTestBean implements MyInterface {
    @Override
    public void doSomething() {
        log.info("Doing something in MyTestBean");
    }
    @PostConstruct
    public void postConstruct() {
        log.info("MyTestBean bean is initialized");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("MyTestBean bean is destroyed");
    }

}