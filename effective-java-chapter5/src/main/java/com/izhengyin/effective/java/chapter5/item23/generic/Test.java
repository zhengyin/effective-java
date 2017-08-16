package com.izhengyin.effective.java.chapter5.item23.generic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by zhengyin on 2017/8/15 下午12:30.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Test {

    public static void main(String[] args){
        testGenericArray();
    }

    /**
     * 泛型数组测试
     */
    public static void testGenericArray(){
      //  List<String>[] lists = new List<String>[10];    //error defined
        List<?>[] lists = new List<?>[10];
        List<String> strings = new ArrayList<>();
        strings.add("strings");
        lists[0] = strings;
        List<Integer> integers = new ArrayList<>();
        integers.add(123);
        lists[1] = integers;

        for(int i = 0;i<lists.length;i++){
            if(lists[i] == null){
                continue;
            }
            if(String.class.equals(lists[i].get(0).getClass())){
                String v = (String) lists[i].get(0);
                System.out.println("v => "+v);
            }
            if(Integer.class.equals(lists[i].get(0).getClass())){
                Integer v = (Integer) lists[i].get(0);
                System.out.println("v => "+v);
            }
        }

    }

}
