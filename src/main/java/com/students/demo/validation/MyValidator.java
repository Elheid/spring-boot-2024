package com.students.demo.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;



public class MyValidator implements ConstraintValidator<MyValidationConstraint, String> {
    @Override
    public void initialize(MyValidationConstraint constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        boolean hasDigit = false;
        boolean hasUpperCase = false;
        for (char symbol : value.toCharArray()) {
            if (Character.isDigit(symbol)) {
                hasDigit = true;
            } else if (Character.isUpperCase(symbol)) {
                hasUpperCase = true;
            }
        }
        if (!(hasDigit && hasUpperCase)) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Value must have at least one number and one capital letter")
                    .addConstraintViolation();
            return  false;
        }
        return  true;
    }
}