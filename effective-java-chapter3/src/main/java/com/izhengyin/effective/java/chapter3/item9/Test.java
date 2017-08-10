package com.izhengyin.effective.java.chapter3.item9;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhengyin on 2017/8/9 下午4:35.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Test {
    public static void main(String[] args){

        /**
         * Equals
         */

        Student student1 = new Student("张三",12);
        Student student2 = new Student("张三",12);
        Student student3 = new Student("张三",12);
        System.out.println(student1.equals(student2));
        System.out.println(student1.equals(student3));
        System.out.println(student3.equals(student2));


        /**
         *  HashCode 规约 ： 如果两个对象的equals相同，那么他们的hashCode也应该返回同样的整数
         */

        // 测试 HashCode , @see Student 21 行
        Map<Student,String> hashMap = new HashMap<>();
        hashMap.put(student1,"student1");
        System.out.println(student1.hashCode()+" => "+hashMap.get(student1));
        System.out.println(student2.hashCode()+" => "+hashMap.get(student2));
        System.out.println(student3.hashCode()+" => "+hashMap.get(student3));

    }
}
