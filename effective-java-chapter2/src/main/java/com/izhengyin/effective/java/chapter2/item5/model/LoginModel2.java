package com.izhengyin.effective.java.chapter2.item5.model;

import com.izhengyin.effective.java.chapter2.item5.dao.LoginRecordDao;
import com.izhengyin.effective.java.chapter2.item5.dao.UserDao;
import com.izhengyin.effective.java.chapter2.item5.domain.LoginRecord;
import com.izhengyin.effective.java.chapter2.item5.domain.User;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by zhengyin on 2017/8/5 上午9:40.
 * Email  <zhengyin.name@gmail.com> .
 */
public class LoginModel2 {

    private  UserDao userDao;
    private  LoginRecordDao loginRecordDao;



    private String clientIp;

    public LoginModel2(String clientIp){
        this.clientIp = clientIp;
        this.userDao = new UserDao();
        this.loginRecordDao = new LoginRecordDao();
    }

    public boolean login(String username,String password){
        User user = userDao.get(username);
        if(user == null){
            return false;
        }
        if(password != null && password.equals(user.getPassword())){
            LoginRecord loginRecord = new LoginRecord();
            loginRecord.setLoginIp(clientIp);
            loginRecord.setLoginTime(new Timestamp(new Date().getTime()));
            loginRecordDao.add(loginRecord);
            return true;
        }
        return false;
    }

}
