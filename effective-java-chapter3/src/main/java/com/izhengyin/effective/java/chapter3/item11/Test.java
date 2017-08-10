package com.izhengyin.effective.java.chapter3.item11;


/**
 * Created by zhengyin on 2017/8/9 下午4:47.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Test {
    public static void main(String[] args){
        Student student1 = new Student("张三",12);
        System.out.println(student1);
        Student student2 = student1.clone();
        System.out.println(student2);


        /**
         *  Clone : 三条规约
         */
        System.out.println(student1 != student2);
        System.out.println(student1.equals(student1));
        System.out.println(student1.getClass() == student2.getClass());

    }
}
