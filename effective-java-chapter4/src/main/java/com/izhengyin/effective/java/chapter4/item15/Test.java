package com.izhengyin.effective.java.chapter4.item15;


import java.util.Date;
import java.sql.Timestamp;

/**
 * Created by zhengyin on 2017/8/11 下午2:42.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Test {

    private static long counter = 0;

    public static void main(String[] args){
        for(int i=0;i<100;i++){
            sendMessage();
        }
    }
    // 当消息产生后，它就是不可变的，就像是说出去的话是收不回来的。
    public static void sendMessage(){
        counter ++;
        //Message message = new Message(counter,1,2,"message",new Timestamp(new Date().getTime()));
        Message message = Message.valueOf(counter,1,2,"message",new Timestamp(new Date().getTime()));
        System.out.println(message);
    }
}
