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
public class LoginModel {

    private static UserDao USER_DAO;
    private static LoginRecordDao LOGIN_RECORD_DAO;

    static {
        // 不可变对象 , 可在静态代码块实例化
        USER_DAO = new UserDao();
        LOGIN_RECORD_DAO = new LoginRecordDao();
    }


    private String clientIp;

    public LoginModel(String clientIp){
        this.clientIp = clientIp;
    }

    public boolean login(String username,String password){
        User user = USER_DAO.get(username);
        if(user == null){
            return false;
        }
        if(password != null && password.equals(user.getPassword())){
            LoginRecord loginRecord = new LoginRecord();
            loginRecord.setLoginIp(clientIp);
            loginRecord.setLoginTime(new Timestamp(new Date().getTime()));
            LOGIN_RECORD_DAO.add(loginRecord);
            return true;
        }
        return false;
    }

}
