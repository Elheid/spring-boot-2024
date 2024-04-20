package com.students.demo.EventListeners;

import com.students.demo.EventListeners.events.CommonEvent;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class CommonEventListener {

    @EventListener
    public void handleEvent(CommonEvent event) {
        log.info("Simple Event handled: " + event.message());
    }
}
