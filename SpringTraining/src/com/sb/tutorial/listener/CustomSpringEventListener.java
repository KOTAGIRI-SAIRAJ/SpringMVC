package com.sb.tutorial.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class CustomSpringEventListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("Received spring custom event - " + event);
    }
}
