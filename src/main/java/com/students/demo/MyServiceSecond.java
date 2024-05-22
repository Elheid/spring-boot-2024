package com.students.demo;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@FieldDefaults(makeFinal=true, level= AccessLevel.PRIVATE)
public class MyServiceSecond {


    // DI через конструктор
    final MyInterface MyBinThird;
    public MyServiceSecond(MyBeanThird MyBinThird) {
        this.MyBinThird = MyBinThird;
        log.info("Произошла инициализация бина по конструктору");
    }

    public void doSomething() {
        log.info("Service Second ding smth");
        MyBinThird.doSomething();
    }
}