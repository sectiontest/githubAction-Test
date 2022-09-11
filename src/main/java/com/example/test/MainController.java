package com.example.test;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final MainService mainService;

    @PostMapping("/member/{name}")
    public String findMember(String name) {
        return mainService.MemberName(name);
    }

//    @GetMapping("/test")
//    public String testWorld() {
//        return testMsg;
//    }
}
