package com.izhengyin.effective.java.chapter3.item9;

/**
 * Created by zhengyin on 2017/8/9 下午4:15.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Student {
    private String name;
    private int age;

    public Student(String name ,int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public int hashCode() {
        return 31 * age + name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Student)){
            return false;
        }
        if(obj == this){
            return true;
        }
        Student student = (Student)obj;
        if(this.name == student.name && this.age == student.age){
            return true;
        }
        return false;
    }
}
