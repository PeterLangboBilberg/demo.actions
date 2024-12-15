package com.simple.web.demo.actions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionController {

    @GetMapping
    public String getGreeting(){
        return "Hello2";
    }
}
