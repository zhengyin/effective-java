package com.izhengyin.effective.java.chapter5.item24;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhengyin on 2017/8/16 上午10:01.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Test {

    public static void main(String[] args){
        errorExample1();
    }


    public static void errorExample1(){
        Set<String> strings = new HashSet();            // warning
        Set<String> strings1 = new HashSet<>();         // right
        @SuppressWarnings("unchecked") Set<Integer> integers = new HashSet(); // @SuppressWarnings("unchecked") 屏蔽编译器 warning
    }

}
