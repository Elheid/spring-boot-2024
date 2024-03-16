package com.students.demo;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;
import lombok.experimental.PackagePrivate;

@Service
@Log4j2
@FieldDefaults(makeFinal=true, level=AccessLevel.PRIVATE)
public class MyService {


    //DI через поле
   @Autowired
   @NonFinal MyBeanFirst myBean1;

    // DI через setter
    @NonFinal MyInterface myBean2;
    @Autowired
    private void setMyService2(MyBeanSecond myBean2) {
        this.myBean2 = myBean2;
        log.info("Произошла инициализация бина через setter");
    }

    // DI через конструктор

    private final MyInterface myBean3;
    private MyService(MyBeanThird myBean3) {
        this.myBean3 = myBean3;
        log.info("Произошла инициализация бина по конструктору");
    }


    public void doSomething() {
        log.info("Service ding smth");
        myBean1.doSomething();
        myBean2.doSomething();
        myBean3.doSomething();
    }
}