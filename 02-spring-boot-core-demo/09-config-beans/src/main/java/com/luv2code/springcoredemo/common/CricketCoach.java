package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Mark the class as a Spring bean using this annotation.
@Component
public class CricketCoach implements Coach {
    public CricketCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    //defining our init method
    @PostConstruct
    public void init(){
        System.out.println("init method called");
        System.out.println("in init method:" + getClass().getSimpleName());
    }

    //defining our dispose method
    @PreDestroy
    public void dispose(){
        System.out.println("dispose method called");
        System.out.println("in dispose method:" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
