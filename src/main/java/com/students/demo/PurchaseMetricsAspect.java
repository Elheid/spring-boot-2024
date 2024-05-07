package com.students.demo;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Log4j2
public class PurchaseMetricsAspect {

    private long startTime;
    private int requestCount;

    @Before("execution(* com.students.demo.Controllers.ProductController.buyProduct(..))")
    public void beforePurchase(JoinPoint joinPoint) {
        startTime = System.currentTimeMillis();
        requestCount++;
    }

    @After("execution(* com.students.demo.Controllers.ProductController.buyProduct(..))")
    public void afterPurchase(JoinPoint joinPoint) {
        long executionTime = System.currentTimeMillis() - startTime;
        log.info("Purchase request executed in " + executionTime + " milliseconds");
        log.info("Total requests: " + requestCount);
    }
}