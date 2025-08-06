package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

//Mark the class as a Spring bean using this annotation.
@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
