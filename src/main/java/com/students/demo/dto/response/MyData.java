package com.students.demo.dto.response;

import com.students.demo.dto.request.RequestInfo;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@FieldDefaults(level= AccessLevel.PRIVATE)
public class MyData {
    double price;
    Info info;

    public MyData(double price, RequestInfo info){
        this.price = price;
        this.info = new Info();
        this.info.setDate(info.getDate());
    }

}
