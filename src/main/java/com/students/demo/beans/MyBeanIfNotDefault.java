package com.students.demo.beans;


import com.students.demo.MyInterface;
import com.students.demo.NotDefaultValueCondition;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Log4j2
@Conditional(NotDefaultValueCondition.class)
public class MyBeanIfNotDefault implements MyInterface {
    @Override
    public void doSomething() {
        log.info("Doing something in MyBeanIfNotDefault");
    }
    @PostConstruct
    public void postConstruct() {
        log.info("MyBeanIfNotDefault bean is initialized");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("MyBeanIfNotDefault bean is destroyed");
    }
}