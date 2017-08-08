package com.izhengyin.effective.java.chapter2.item3.serializable;

import java.io.Serializable;

/**
 * Created by zhengyin on 2017/8/4 上午10:21.
 * Email  <zhengyin.name@gmail.com> .
 */
public class MySingleton implements Serializable{

    public static final MySingleton INSTANCE = new MySingleton();

    private MySingleton(){
        System.out.println(MySingleton.class.getName()+" 被实例化了。 ["+ this+"]");
    }

    public void say(){
        System.out.println(this.getClass().getName() +" -> Say : ["+ this+"]");
    }

    private Object readResolve() {
        // 保证 反序列化时， JVM 中只存在同一个对象，维持单例特性
        return INSTANCE;
    }

}
