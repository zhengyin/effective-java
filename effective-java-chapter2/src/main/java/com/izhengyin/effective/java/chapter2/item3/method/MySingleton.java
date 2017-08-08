package com.izhengyin.effective.java.chapter2.item3.method;

/**
 * Created by zhengyin on 2017/8/4 上午11:02.
 * Email  <zhengyin.name@gmail.com> .
 */
public class MySingleton {
    private static MySingleton INSTANCE = null;
    public static MySingleton getInstace(){
        if(INSTANCE == null){
            INSTANCE = new MySingleton();
        }
        return INSTANCE;
    }

    private MySingleton(){
        System.out.println(MySingleton.class.getName()+" 被实例化了。 ["+ this+"]");
    }
    public void say(){
        System.out.println(this.getClass().getName() +" -> Say : ["+ this+"]");
    }
}
