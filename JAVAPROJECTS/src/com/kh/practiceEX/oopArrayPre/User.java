package com.kh.practiceEX.oopArrayPre;

public class User {
    private String userName;
    private String email;
    private int age;

    // 메서드 기본 / 매개변수 / set / get toString


    public User() {
    }

    public User(String userName, String email /*,int age*/) {
        this.userName = userName;
        this.email = email;
        // this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
        return  "userName='" + userName +   ", email='" + email + ", age=" + age ;
    }
}
