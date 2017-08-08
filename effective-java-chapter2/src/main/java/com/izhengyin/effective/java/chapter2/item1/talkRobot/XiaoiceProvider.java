package com.izhengyin.effective.java.chapter2.item1.talkRobot;

/**
 * Created by zhengyin on 2017/8/2 上午10:57.
 * Email  <zhengyin.name@gmail.com> .
 */
public class XiaoiceProvider implements Provider{

    static {
        ProviderManager.register("xiaoice",new XiaoiceProvider());
    }

    @Override
    public Robot newRobot() {
        return new XiaoIceRobot();
    }
}
