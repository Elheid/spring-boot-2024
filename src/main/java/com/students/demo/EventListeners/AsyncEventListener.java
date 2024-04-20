package com.students.demo.EventListeners;

import com.students.demo.EventListeners.events.AsyncEvent;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class AsyncEventListener {

    @Async
    @EventListener
    public void handleEvent(AsyncEvent event) {
        log.info("Async Event handled: " + event.message());
    }
}