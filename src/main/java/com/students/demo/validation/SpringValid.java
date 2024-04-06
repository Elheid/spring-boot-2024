package com.students.demo.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpringValid implements ConstraintValidator<MyValidationConstraint, String> {
    @Override
    public void initialize(MyValidationConstraint constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return  true;
    }
}