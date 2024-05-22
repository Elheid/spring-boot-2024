package com.students.demo.Controllers;


public class CustomValidationException extends RuntimeException {
    public CustomValidationException(String message) {
        super(message);
    }
}