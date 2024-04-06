package com.students.demo.dto.request;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.Getter;
import lombok.Setter;

@FieldDefaults(level= AccessLevel.PRIVATE)
@Getter
@Setter
public class DataRequest {
    private double price;
    private RequestInfo info;
}