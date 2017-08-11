package com.izhengyin.effective.java.chapter4.item13;

import com.izhengyin.effective.java.chapter4.item13.A.A;
import com.izhengyin.effective.java.chapter4.item13.login.Api;
import com.izhengyin.effective.java.chapter4.item13.login.ApiService;

/**
 * Created by zhengyin on 2017/8/11 下午2:14.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Test {
    public static void main(String[] args){
        System.out.println(A.hello());
    //    System.out.println(B.hello());
        Api api = new ApiService();


        // 包级私有 , 隐藏内部登录实现细节
        System.out.println(api.login("a","b"));
    }
}
