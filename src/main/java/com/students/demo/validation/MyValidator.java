package com.students.demo.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MyValidator implements ConstraintValidator<CustomValidationConstraint, String> {
    @Override
    public void initialize(CustomValidationConstraint constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        boolean hasDigit = false;
        boolean hasUpperCase = false;
        String validationError = "Value must have at least one number and one capital letter";

        Pattern pattern = Pattern.compile("(?=.*\\d)(?=.*[A-Z])");
        Matcher matcher = pattern.matcher(value);

        if (matcher.find()) {
            hasDigit = true;
            hasUpperCase = true;
        }
        if (!hasDigit || !hasUpperCase){
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(validationError)
                    .addConstraintViolation();
            return  false;
        }
        return  true;
    }
}