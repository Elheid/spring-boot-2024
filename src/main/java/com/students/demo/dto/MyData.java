package com.students.demo.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

//@FieldDefaults(level= AccessLevel.PRIVATE)
@Getter
@Setter
public class MyData {
    private double price;
    private Info info;

    public MyData(double price, Info info){
        this.price = price;
        this.info = info;
    }

}
