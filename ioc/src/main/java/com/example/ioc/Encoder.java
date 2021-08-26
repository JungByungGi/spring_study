package com.example.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component // component annotation을 지정할 때 따로 이름을 지정하지 않으면 class 이름의 첫 글자를 소문자로 하여 class 이름으로 지정된다.
public class Encoder {

    private IEncoder iEncoder;

    //의존성 주입하기
    public Encoder (IEncoder iEncoder){
        this.iEncoder = iEncoder;
    }

    public void setIEncoder(IEncoder iEncoder){
        this.iEncoder = iEncoder;
    }

    public String encode(String message){
        return iEncoder.encode(message);
    }
}
