package com.example.springstart;

import com.example.springstart.dto.User2;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringStartApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("-------------------");

        // Text Json -> Object
        // Object -> Text Json

        var objectMapper = new ObjectMapper();

        // Object -> Text Json
        var user = new User2("steve", "steve@gmail.com", 15, "010-0000-0000");

        var text = objectMapper.writeValueAsString(user);
        System.out.println(text);

        // Text Json -> Object
        // objectMapper는 default 생성자를 필요로 한다.
        // 내가 작성한 클래스가 objectMapper에 사용되는 경우 메소드 앞에 get을 붙이면 안된다.
        var objectUser = objectMapper.readValue(text, User2.class);
        System.out.println(objectUser);
    }

}
