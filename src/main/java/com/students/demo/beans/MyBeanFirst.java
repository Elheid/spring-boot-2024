package com.students.demo.beans;
import com.students.demo.MyInterface;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class MyBeanFirst implements MyInterface {
    @Override
    public void doSomething() {
        log.info("Doing something in MyBean1");
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


