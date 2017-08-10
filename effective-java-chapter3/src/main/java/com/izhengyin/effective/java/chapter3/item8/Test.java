package com.izhengyin.effective.java.chapter3.item8;

/**
 * Created by zhengyin on 2017/8/9 下午2:54.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Test {

    public static void main(String[] args){
        test1();
        System.out.println("--- --- --- --- --- --- test1 End!");
        test2();
    }


    /**
     * Equals 与 ==
     */
    public static void test1(){
        // .. String
        String s1 = "a";
        String s2 = "a";
        String s3 = new String("a");
        System.out.println(s1 == s2);   // true    字符串常量区地址相同
        System.out.println(s1 == s3);   // false   字符串常量区与堆中地址比较，地址不同
        System.out.println(s1.equals(s2)); // true 值相等
        System.out.println(s1.equals(s3)); // true 值相等
        // .. StringBuilder
        StringBuilder builder1 = new StringBuilder("a");
        StringBuilder builder2 = new StringBuilder("a");
        System.out.println(builder1 == builder2);        // false  堆中地址不同
        System.out.println(builder1.equals(builder2));   // false  StringBuilder 直接使用 Object equals ， Object equals 直接比较的是地址
        System.out.println(builder1.toString() == builder2.toString());      // false
        System.out.println(builder1.toString().equals(builder2.toString())); // true
    }


    /**
     * 对称性
     */
    public static void test2(){
        CaseInsensitiveString s1 = new CaseInsensitiveString("ABC");
        String s2 = "abc";
        CaseInsensitiveString s3 = new CaseInsensitiveString("abc");
        System.out.println(s1.equals(s2));      // false
        System.out.println(s2.equals(s1));      // false
        System.out.println(s1.equals(s3));      // true
        System.out.println(s3.equals(s1));      // true
    }
}
