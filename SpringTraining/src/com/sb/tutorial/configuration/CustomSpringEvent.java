package com.sb.tutorial.configuration;

import org.springframework.context.ApplicationEvent;

public class CustomSpringEvent  extends ApplicationEvent {
    private String message;

    public CustomSpringEvent(Object source) {
        super(source);
    }
}
