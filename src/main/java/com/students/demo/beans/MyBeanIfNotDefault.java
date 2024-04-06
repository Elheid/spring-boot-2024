package com.students.demo.beans;

import com.students.demo.MyInterface;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

@Component
@Log4j2
@ConditionalOnExpression("'${app.env-var}' != 'default'")
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