package com.students.demo.dto;

import com.students.demo.validation.CustomValidationConstraint;
import com.students.demo.validation.MyValidationConstraint;

public record Data(
     @CustomValidationConstraint
     @MyValidationConstraint
     String data
){}