package com.izhengyin.effective.java.chapter2.item1.talkRobot;

/**
 * Created by zhengyin on 2017/8/2 上午10:32.
 * Email  <zhengyin.name@gmail.com> .
 */
public class TuringProvider implements Provider {

    static {
        ProviderManager.register("turing",new TuringProvider());
    }

    @Override
    public Robot newRobot() {
        return new TuringRobot();
    }
}
