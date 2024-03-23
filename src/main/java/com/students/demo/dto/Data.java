package com.students.demo.dto;

import com.students.demo.validation.MyValidationConstraint;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Data {
    @MyValidationConstraint
    String data;
}