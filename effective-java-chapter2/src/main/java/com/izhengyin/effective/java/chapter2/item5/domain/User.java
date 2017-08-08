package com.izhengyin.effective.java.chapter2.item5.domain;

/**
 * Created by zhengyin on 2017/8/5 上午9:43.
 * Email  <zhengyin.name@gmail.com> .
 */
public class User {
    private int userId;
    private String username;
    private String password;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
