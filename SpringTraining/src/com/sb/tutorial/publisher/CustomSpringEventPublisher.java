package com.sb.tutorial.publisher;

import com.sb.tutorial.configuration.CustomSpringEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomSpringEventPublisher  implements ApplicationEventPublisherAware {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;
    public void doProcessAndPublishAnEvent() {
        System.out.println("Publishing custom event. ");
        applicationEventPublisher.publishEvent(new CustomSpringEvent(this));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
