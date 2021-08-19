package com.example.springstart.controller;

import com.example.springstart.dto.User;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {
    //현재 방식
    @GetMapping(path="/hello")
    public String getHello(){
        return "get hello";
    }
    
    //과거 방식
    @RequestMapping(path="/hi", method = RequestMethod.GET) // get, post, put, delete 모두에 적용되므로 method를 지정
    public String getHi(){
        return "get hi";
    }
    
    // http://localhost:9090/api/get/path-variable/{name}
    //path variable 넣기
    // {name}과 파라미터 변수가 같아야 한다. 하지만 같지 않을 경우에는 PathVariable 어노테이션의 name 변수에 아래와 같이 uri 식별자를 적어주면 된다.
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name="name") String pathName){
        System.out.println(pathName);
        return pathName;
    }

    // http://localhost:9090/api/get/query-param/v1?user=steve&email=steve@gmail.com
    // query parameter 넣기 1
    // map 이용
    @GetMapping(path="/query-param/v1")
    public String queryParam(@RequestParam Map<String, String> queryParam){
        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });
        return sb.toString();
    }

    // http://localhost:9090/api/get/query-param/v2?user=steve&email=steve@gmail.com&age=30
    // query parameter 넣기 2 
    // RequestParam 어노테이션 이용
    @GetMapping(path="/query-param/v2")
    public String queryParam(@RequestParam String user,
                             @RequestParam String email,
                             @RequestParam int age
    ){
        System.out.println(user);
        System.out.println(email);
        System.out.println(age);
        System.out.println("\n");


        return user + " " + email + " " + age;
    }

    // http://localhost:9090/api/get/query-param/v3?user=steve&email=steve@gmail.com&age=30
    // query parameter 넣기 3
    // dto 이용
    @GetMapping(path="/query-param/v3")
    public String queryParam(User user){
        System.out.println(user.getUser());
        System.out.println(user.getEmail());
        System.out.println(user.getAge());
        System.out.println("\n");

        return user.toString();
    }
}
