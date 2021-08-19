package com.example.springstart.dto;

public class User {
    private String user;
    private String email;
    private int age;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "user='" + user + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
