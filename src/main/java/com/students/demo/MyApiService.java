package com.students.demo;


import org.springframework.stereotype.Component;

@Component
public class MyApiService implements ApiService {

    @Override
    @NumberOfRequest
    public boolean doSomething() {
        System.out.println("Api method doing smth");
        return true;
    }
}