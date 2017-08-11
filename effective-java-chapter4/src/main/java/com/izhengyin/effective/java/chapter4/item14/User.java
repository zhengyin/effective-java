package com.izhengyin.effective.java.chapter4.item14;

/**
 * Created by zhengyin on 2017/8/11 下午2:22.
 * Email  <zhengyin.name@gmail.com> .
 */
class User {
    public int userId;
    public String username;

    public User(int userId, String username) {
        this.userId = userId;
        this.username = username;
    }

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
}
