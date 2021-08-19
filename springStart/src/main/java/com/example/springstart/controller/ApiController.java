package com.example.springstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // 해당 클래스는 rest api를 처리하는 controller
@RequestMapping("/api") //URI를 지정해주는 어노테이션
public class ApiController {
    @GetMapping("/hello") // http://localhost:9090/api/hello
    public String hello(){
        return "Hello String boot";
    }
}
