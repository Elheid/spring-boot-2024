package com.students.demo.dto;

import com.students.demo.validation.CustomValidationConstraint;
import com.students.demo.validation.MyValidationConstraint;
import lombok.Getter;
import lombok.Setter;

public record Data(
     @CustomValidationConstraint
     @MyValidationConstraint
     String data
){}