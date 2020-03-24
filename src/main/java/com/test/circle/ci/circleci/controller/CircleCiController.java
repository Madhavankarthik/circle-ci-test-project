package com.test.circle.ci.circleci.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircleCiController {

    @GetMapping("helloworld")
    public String testHelloWorld(){
        return "Hello World";
    }
}
