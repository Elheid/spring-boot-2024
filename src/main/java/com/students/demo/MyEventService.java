package com.students.demo;


import com.students.demo.EventListeners.events.AsyncEvent;
import com.students.demo.EventListeners.events.CommonEvent;
import com.students.demo.EventListeners.events.TransactionalEvent;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.transaction.Transactional;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class MyEventService {

    private final ApplicationEventPublisher eventPublisher;

    public MyEventService(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    @PostConstruct
    public void postConstruct() {
        log.info("EventService bean is initialized");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("EventService bean is destroyed");
    }

    @Transactional
    public void publishTransaction() {
        eventPublisher.publishEvent(new TransactionalEvent("Hello from Transactional Event"));
    }
    public void publishEvents() {
        eventPublisher.publishEvent(new CommonEvent("Hello from Simple Event"));

        eventPublisher.publishEvent(new AsyncEvent("Hello from Async Event"));
    }
}