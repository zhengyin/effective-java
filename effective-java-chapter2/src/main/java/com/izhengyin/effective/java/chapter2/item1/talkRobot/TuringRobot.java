package com.izhengyin.effective.java.chapter2.item1.talkRobot;

/**
 * Created by zhengyin on 2017/8/2 上午10:30.
 * Email  <zhengyin@kongfz.com> .
 */
public class TuringRobot implements Robot{
    @Override
    public String hello() {
        return "Hi , my name is TuringRobot.";
    }
}
