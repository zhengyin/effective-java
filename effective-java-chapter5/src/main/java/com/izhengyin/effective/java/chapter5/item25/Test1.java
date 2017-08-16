package com.izhengyin.effective.java.chapter5.item25;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengyin on 2017/8/16 下午1:57.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Test1 {

    public static void main(String[] args){

        // 使用数组的缺陷
        Object[] objects = new Object[10];
        objects[0] = 123456;
        objects[1] = "I`am last value!";
        System.out.println((Integer)objects[0]);
        System.out.println((Integer)objects[1]);        // 运行时产生，ClassCastException

        // 使用List 编译时就可以发现错误
        List<Integer> stringList = new ArrayList<>();
        stringList.add(123456);
        //stringList.add("I`am last value!");  //compile error
    }
}
