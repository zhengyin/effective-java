package com.izhengyin.effective.java.chapter3.item12;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by zhengyin on 2017/8/10 下午5:52.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Test {

    public static void main(String args[]){
        Set<User> users = new TreeSet<>();
        for(int i = 100; i>0; i--){
            users.add(new User(i,i%24,"name"+i));
        }

        Iterator<User> iterator = users.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
