package com.landerer.spring.didemo.controllers;

import org.springframework.stereotype.Controller;

// @Controller("doNotCallMeNames")
@Controller
public class DiDemoController {
    public String sayHello() {
        return "Hello!";
    }
}
