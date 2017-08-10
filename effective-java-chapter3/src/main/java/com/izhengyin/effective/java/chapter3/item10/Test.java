package com.izhengyin.effective.java.chapter3.item10;

/**
 * Created by zhengyin on 2017/8/9 下午4:35.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Test {
    public static void main(String[] args){
        Response response = new Response();
        response.setStatus(false);
        response.setCode(1001);
        response.setMessage("error message");
        System.out.println(response);
    }
}
