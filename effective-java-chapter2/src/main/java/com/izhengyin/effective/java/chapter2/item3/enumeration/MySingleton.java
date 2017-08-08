package com.izhengyin.effective.java.chapter2.item3.enumeration;

/**
 * Created by zhengyin on 2017/8/4 上午10:57.
 * Email  <zhengyin.name@gmail.com> .
 */
public enum MySingleton {
    INSTANCE;
    public void say(){
        System.out.println(this.getClass().getName() +" -> Say : ["+ this+"]");
    }
}
