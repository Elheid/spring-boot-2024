package com.students.demo.EventListeners;

import com.students.demo.EventListeners.events.TransactionalEvent;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionalEventListener;


@Service
@Log4j2
public class TransactionEventListener {


    @TransactionalEventListener
    public void handleEvent(TransactionalEvent event) {
        log.info("Transactional Event 1 handled: " + event.message());
    }


    @TransactionalEventListener
    public void handleSecondEvent(TransactionalEvent event) {

        log.info("Second Transactional Event 2 handled: " + event.message());
    }
}