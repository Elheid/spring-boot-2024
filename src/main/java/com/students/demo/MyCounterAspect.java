package com.students.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Aspect
@Component
public class MyCounterAspect {

    private final AtomicInteger apiCallCount = new AtomicInteger(0);

    @Value("${api.maxCallCount}")
    private int maxApiCallCount;

    @Pointcut("@annotation(NumberOfRequest)")
    public void apiMethods() {}

    @Around("apiMethods()")
    public Object countApiCalls(ProceedingJoinPoint joinPoint) throws Throwable {
        if (apiCallCount.get() >= maxApiCallCount) {
            throw new RuntimeException("API method call exceeded max count");
        } else {
            apiCallCount.incrementAndGet();
            return joinPoint.proceed();
        }

    }
}