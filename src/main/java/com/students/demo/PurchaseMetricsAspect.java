package com.students.demo;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Aspect
@Component
@Log4j2
public class PurchaseMetricsAspect {

    private ThreadLocal<Long> startTime = ThreadLocal.withInitial(() -> 0L);
    private final AtomicInteger requestCount = new AtomicInteger(0);

    @Before("execution(* com.students.demo.Controllers.ProductController.buyProduct(..))")
    public void beforePurchase(JoinPoint joinPoint) {
        startTime.set(System.currentTimeMillis());
        requestCount.incrementAndGet();
    }

    @After("execution(* com.students.demo.Controllers.ProductController.buyProduct(..))")
    public void afterPurchase(JoinPoint joinPoint) {
        long executionTime = System.currentTimeMillis() - startTime.get();;
        log.info("Purchase request executed in " + executionTime + " milliseconds");
        log.info("Total requests: " + requestCount);
    }
}