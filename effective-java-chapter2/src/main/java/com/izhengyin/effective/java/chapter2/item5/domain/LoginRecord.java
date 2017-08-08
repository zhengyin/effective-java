package com.izhengyin.effective.java.chapter2.item5.domain;

import java.sql.Timestamp;

/**
 * Created by zhengyin on 2017/8/5 上午9:43.
 * Email  <zhengyin.name@gmail.com> .
 */
public class LoginRecord {
    private int userId;
    private String loginIp;
    private Timestamp loginTime;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Timestamp getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Timestamp loginTime) {
        this.loginTime = loginTime;
    }
}
