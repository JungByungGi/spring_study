package com.example.springstart.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeleteApiController {
    @DeleteMapping("/delete/{user-id}")
    public void delete(@PathVariable(name="user-id") String userId, @RequestParam String account){
        System.out.println(userId);
        System.out.println(account);
    }
}
