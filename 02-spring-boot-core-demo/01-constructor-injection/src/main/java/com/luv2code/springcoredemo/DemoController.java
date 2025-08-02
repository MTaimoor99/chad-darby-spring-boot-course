package com.luv2code.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define a private field for the dependency
    private Coach myCoach;

    //define a constructor for dependency injection
    //autowired tells spring to inject the dependency.
    @Autowired
    public DemoController(Coach theCoach){
        myCoach = theCoach;
    }
}
