package com.students.demo.Controllers;

import com.fasterxml.jackson.annotation.JsonInclude;

public class CustomValidationException extends RuntimeException {
    public CustomValidationException(String message) {
        super(message);
    }
}