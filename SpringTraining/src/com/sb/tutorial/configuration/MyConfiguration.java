package com.sb.tutorial.configuration;

import com.sb.tutorial.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value="com.sb.tutorial")
public class MyConfiguration {

    @Bean
    public MyService getService(){
        return new MyService();
    }
}