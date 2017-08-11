package com.izhengyin.effective.java.chapter4.item14;

/**
 * Created by zhengyin on 2017/8/11 下午2:42.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Test {
    public static void main(String[] args){
        User user = new User(1,"a");
        errorChange(user);
        System.out.println(user.getUserId());
    }

    //  直接暴露共有内的属性，不是一种好做法
    public static void errorChange(User user){
        user.userId = 1000;
    }
}
