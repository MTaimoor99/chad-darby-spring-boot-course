package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FootballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice penalties for 15 minutes";
    }
}
