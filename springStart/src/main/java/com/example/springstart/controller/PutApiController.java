package com.example.springstart.controller;

import com.example.springstart.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put/v1")
    public PutRequestDto putV1(@RequestBody PutRequestDto putRequestDto){
        System.out.println(putRequestDto);
        return putRequestDto;
    }

    @PutMapping("/put/v2/{user-id}")
    public PutRequestDto putV2(@RequestBody PutRequestDto putRequestDto, @PathVariable(name="user-id") Long id){
        System.out.println(id);
        return putRequestDto;
    }
}
