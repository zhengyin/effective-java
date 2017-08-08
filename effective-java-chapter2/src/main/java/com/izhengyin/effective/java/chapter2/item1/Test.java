package com.izhengyin.effective.java.chapter2.item1;

import com.izhengyin.effective.java.chapter2.item1.talkRobot.ProviderManager;
import com.izhengyin.effective.java.chapter2.item1.talkRobot.Robot;
import com.izhengyin.effective.java.chapter2.item1.talkRobot.TuringProvider;
import com.izhengyin.effective.java.chapter2.item1.talkRobot.XiaoiceProvider;

/**
 * Created by zhengyin on 2017/8/2 上午10:45.
 * Email  <zhengyin@kongfz.com> .
 */
public class Test {

    public static void main(String[] args) throws ClassNotFoundException {
        testTalkRobot();
    }

    public static void testTalkRobot() throws ClassNotFoundException {

        Class.forName(TuringProvider.class.getName());
        Robot turing = ProviderManager.newInstance("turing");
        System.out.println(turing.hello());

        Class.forName(XiaoiceProvider.class.getName());
        Robot xiaoice = ProviderManager.newInstance("xiaoice");
        System.out.println(xiaoice.hello());



    }
}
