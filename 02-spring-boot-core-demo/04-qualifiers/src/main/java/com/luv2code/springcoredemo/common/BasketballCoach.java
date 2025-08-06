package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Practice free throws for 15 minutes";
    }
}
