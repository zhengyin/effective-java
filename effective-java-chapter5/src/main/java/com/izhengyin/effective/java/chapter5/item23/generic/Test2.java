package com.izhengyin.effective.java.chapter5.item23.generic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by zhengyin on 2017/8/15 下午12:30.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Test2 {

    public static void main(String[] args){
        Set<String> strings = new HashSet<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        errorDefined(strings);
        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        errorDefined(integers); // error



    }



    /**
     * 错误的参数定义 , 未指定 Set 的类型 , 容易在运行时导致 ClassCastException
     * @param set
     */
    public static void errorDefined(Set set){
        for(Object o : set){
            String s = (String)o;
            System.out.println(s);
        }
    }


}
