package com.izhengyin.effective.java.chapter2.item3.field;

/**
 * Created by zhengyin on 2017/8/4 上午11:02.
 * Email  <zhengyin.name@gmail.com> .
 */
public class MySingleton2 {
    public static final MySingleton2 INSTANCE ;
    static {
        INSTANCE = new MySingleton2();
    }
    private MySingleton2(){
        System.out.println(MySingleton2.class.getName()+" 被实例化了。 ["+ this+"]");
    }
    public void say(){
        System.out.println(this.getClass().getName() +" -> Say : ["+ this+"]");
    }
}
