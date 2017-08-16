package com.izhengyin.effective.java.chapter5.item23.generic;

/**
 * Created by zhengyin on 2017/8/16 上午10:37.
 * Email  <zhengyin.name@gmail.com> .
 */
public class GenericInterfaceTest {

    public static void main(String[] args){
        (new Test1()).print("abc");
        (new Test2<Integer>()).print(13);

        Test3 a = new Test3();
        a.print("a");
        a.print(1);

    }

    private static class Test1 implements GenericInterface<String> {
        @Override
        public void print(String v) {
            System.out.println(Test1.class + " ["+v+"]");
        }
    }

    private static class Test2<E> implements GenericInterface<E> {
        @Override
        public void print(E v) {
            System.out.println(Test2.class + " ["+v+"]");
        }
    }

    private static class Test3 implements GenericInterface<Object> {
        @Override
        public void print(Object v) {
            System.out.println(Test1.class + " ["+v+"]");
        }
    }
}
