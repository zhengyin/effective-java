package com.izhengyin.effective.java.chapter4.item15;

import com.alibaba.fastjson.JSON;

import java.sql.Timestamp;

/**
 * Created by zhengyin on 2017/8/11 下午3:05.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Message {
    private final long id;
    private final int sender;
    private final int receiver;
    private final String content;
    private final Timestamp sendTime;
    public Message(long id , int sender, int receiver, String content, Timestamp sendTime) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.sendTime = sendTime;
    }
    public static Message valueOf(long id , int sender, int receiver, String content, Timestamp sendTime){
        return new Message(id , sender, receiver,content,    sendTime);
    }

    public long getId() {
        return id;
    }

    public int getSender() {
        return sender;
    }

    public int getReceiver() {
        return receiver;
    }

    public String getContent() {
        return content;
    }

    public Timestamp getSendTime() {
        return sendTime;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
