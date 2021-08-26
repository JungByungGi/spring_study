package com.example.aop.controller;

import com.example.aop.annotation.Decode;
import com.example.aop.annotation.Timer;
import com.example.aop.dto.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping("/get/{id}")
    public String get(@PathVariable Long id, @RequestParam String name){
//        System.out.println("get method");
//        System.out.println("get method : " + id);
//        System.out.println("get method : " + name);

        return id + " " + name;
    }

    @PostMapping("/post") // json
    public User post(@RequestBody User user){
//        System.out.println("post method : " + user);
        return user;
    }

    @Decode
    @PutMapping("/put") // form-data
    public User postV2(@RequestBody User user){
        System.out.println("put");
        System.out.println(user);
        return user;
    }

    @Timer
    @DeleteMapping("/delete")
    public void delete() throws InterruptedException {
        //db logic이 2초 걸린다고 가정
        Thread.sleep(1000*2);
    }
}
