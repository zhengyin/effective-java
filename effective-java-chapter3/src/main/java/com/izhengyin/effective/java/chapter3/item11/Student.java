package com.izhengyin.effective.java.chapter3.item11;

import com.alibaba.fastjson.JSON;

/**
 * Created by zhengyin on 2017/8/9 下午4:43.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Student implements  Cloneable{
    private String name;
    private int age;

    public Student(String name ,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    @Override
    public Student clone(){
        try{
            return (Student)super.clone();
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}
