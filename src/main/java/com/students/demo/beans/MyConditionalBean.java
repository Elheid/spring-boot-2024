package com.students.demo.beans;

import com.students.demo.MyInterface;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import lombok.extern.log4j.Log4j2;

@Component
@ConditionalOnBean(MyTestBean.class)
@Log4j2
public class MyConditionalBean implements MyInterface {
    @Override
    public void doSomething() {
        log.info("Doing something in MyConditionalBean");
    }
    @PostConstruct
    public void postConstruct() {
        log.info("MyConditionalBean bean is initialized");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("MyConditionalBean bean is destroyed");
    }

}