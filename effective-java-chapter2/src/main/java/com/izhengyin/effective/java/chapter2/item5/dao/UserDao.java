package com.izhengyin.effective.java.chapter2.item5.dao;

import com.izhengyin.effective.java.chapter2.item5.domain.User;

/**
 * Created by zhengyin on 2017/8/5 上午9:41.
 * Email  <zhengyin.name@gmail.com> .
 * 用户
 */
public class UserDao {

    public User get(String username){
        // 伪代码
        User user = new User();
        user.setUserId(1);
        user.setUsername(username);
        user.setPassword("password");
        return new User();
    }
}
