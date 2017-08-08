package com.izhengyin.effective.java.chapter2.item5;

import com.izhengyin.effective.java.chapter2.item5.model.LoginModel;
import com.izhengyin.effective.java.chapter2.item5.model.LoginModel2;

/**
 * Created by zhengyin on 2017/8/5 上午9:37.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Test {
    public static void main(String[] args){
        test1();
        test2();
    }

    public static void test1(){
        long startTime = System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            LoginModel loginModel = new LoginModel("127.0.0.1");
            loginModel.login("username","password");
        }
        System.out.println("test1 : "+ (System.currentTimeMillis() - startTime) + "ms");
    }

    public static void test2(){
        long startTime = System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            LoginModel2 loginModel = new LoginModel2("127.0.0.1");
            loginModel.login("username","password");
        }
        System.out.println("test2 : "+  (System.currentTimeMillis() - startTime) + "ms");
    }
}
