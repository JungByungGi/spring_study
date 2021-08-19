package com.example.springstart.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

public class User2 {
    private String user;
    private String email;
    private int age;

    @JsonProperty("phone_number")
    private String phoneNumber;


    public User2(){
        this.user = null;
        this.email = null;
        this.age = 0;
        this.phoneNumber = null;
    }

    public User2(String user, String email, int age, String phoneNumber) {
        this.user = user;
        this.email = email;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUser() {
        return user;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User2{" +
                "user='" + user + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
