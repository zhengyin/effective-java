package com.izhengyin.effective.java.chapter5.item23.generic;

import com.sun.corba.se.spi.ior.ObjectKey;

/**
 * Created by zhengyin on 2017/8/16 上午10:27.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Generic<T> {
    private T field;
    public Generic(T field){
        this.field = field;
    }

    public T getField() {
        return field;
    }

    public static void main(String[] args){
        Generic<String> generic = new Generic<>("value");
        System.out.println(generic.getField());

        test(new Generic<Object>("abc"));
      //  test(new Generic<String>("abc")); // error  泛型通配符不能具有父子关系


        test2(new Generic<Integer>(123));
        test2(new Generic<Object>("object"));
        test2(new Generic<String>("string"));
    }

    private static void test(Generic<Object> obj){
        System.out.println(obj.getField());
    }

    // 无限制通配符
    private static void test2(Generic<?> obj){
        System.out.println(obj.getField());
    }
}
