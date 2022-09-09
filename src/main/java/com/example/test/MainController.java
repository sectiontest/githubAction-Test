package com.example.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

//    @Value("${test.abc}")
//    private String testMsg;

    @GetMapping("/hello")
    public String helloWorld() {
        return "test hello";
    }

//    @GetMapping("/test")
//    public String testWorld() {
//        return testMsg;
//    }
}
