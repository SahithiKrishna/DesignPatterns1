package com.example.demo.Facade;

public class User {
    private String userName;
    private String mobileNum;
    public User(String userName, String mobileNum){
        this.userName = userName;
        this.mobileNum = mobileNum;
    }

    public String toString(){
        return "userName: "+this.userName+" mobileNum: "+mobileNum;
    }
}
