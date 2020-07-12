package com.iweb.study.day04.java1;

/**
 * @Author Moro
 * @Date 2020/7/7 10:22
 * @title User
 */
public class User {
    private String username;
    private  String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
