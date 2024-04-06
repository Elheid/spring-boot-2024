package com.students.demo;
import com.students.demo.dto.request.DataRequest;
import com.students.demo.dto.response.MyData;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;
import lombok.experimental.PackagePrivate;

import java.util.Random;

@Service
@Log4j2
@FieldDefaults(makeFinal=true, level=AccessLevel.PRIVATE)
public class MyService {


    //DI через поле
   @Autowired
   @NonFinal MyInterface myBeanFirst;

    // DI через setter
    @NonFinal MyInterface myBeanSecond;
    @Autowired
    public void setMyService2(MyInterface myBeanSecond) {
        this.myBeanSecond = myBeanSecond;
        log.info("Произошла инициализация бина через setter");
    }




    public int GetRandomId(){
        Random random = new Random();
        return random.nextInt(0,100);
    }
  
    public MyData CreateResponse(DataRequest someData){
        MyData newData = new MyData(someData.getPrice(), someData.getInfo());
        newData.getInfo().setId(GetRandomId());
        return newData;
    }

    public void doSomething() {
        log.info("Service ding smth");
        myBeanFirst.doSomething();
        myBeanSecond.doSomething();
    }
}