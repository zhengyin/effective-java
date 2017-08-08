package com.izhengyin.effective.java.chapter2.item1.talkRobot;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by zhengyin on 2017/8/2 上午10:34.
 * Email  <zhengyin@kongfz.com> .
 */
public class ProviderManager {

    private static Map<String,Provider> providers = new ConcurrentHashMap<>();

    public static void register(String name, Provider provider){
        providers.put(name,provider);
    }

    public static Robot newInstance(String name){
        Provider provider = providers.get(name);
        if(provider == null){
            throw new IllegalArgumentException("No Provider register with ["+name+"]");
        }
        return provider.newRobot();
    }
}
