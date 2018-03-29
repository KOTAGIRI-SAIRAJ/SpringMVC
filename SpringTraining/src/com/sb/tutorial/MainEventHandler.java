package com.sb.tutorial;

import com.sb.tutorial.publisher.CustomSpringEventPublisher;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainEventHandler {
    public static void main(String args[]) throws BeansException {
        ApplicationContext context =  new FileSystemXmlApplicationContext("web/WEB-INF/dispatcher-servlet.xml");
        CustomSpringEventPublisher publisher = context.getBean(CustomSpringEventPublisher.class);
        publisher.doProcessAndPublishAnEvent();
    }
}
