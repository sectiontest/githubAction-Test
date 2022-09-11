package com.example.test;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final MainService mainService;

    @GetMapping("/member/{name}")
    public String findMember(@PathVariable String name) {
        return mainService.MemberName(name);
    }

    @PostMapping("/member/{name}")
    public String newMember(@PathVariable String name) {
        mainService.InputMember(name);
        return "ok";
    }



//    @GetMapping("/test")
//    public String testWorld() {
//        return testMsg;
//    }
}
