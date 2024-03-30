package com.students.demo.dto.response;

import com.students.demo.dto.request.RequestInfo;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.Getter;
import lombok.Setter;

@FieldDefaults(level= AccessLevel.PRIVATE)
@Getter
@Setter
public class MyData {
    private double price;
    private Info info;

    public MyData(double price, RequestInfo info){
        this.price = price;
        this.info = new Info();
        this.info.setDate(info.getDate());
    }

}
