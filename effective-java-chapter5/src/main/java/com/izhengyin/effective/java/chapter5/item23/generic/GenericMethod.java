package com.izhengyin.effective.java.chapter5.item23.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zhengyin on 2017/8/16 上午11:30.
 * Email  <zhengyin.name@gmail.com> .
 */
public class GenericMethod {

    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();

        //#1
        List<String> strings = new ArrayList<>();
        strings.add("a");
        System.out.println("#1 "+genericMethod.myGenericMethod(strings).getClass());

        //#2
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        System.out.println("#2 "+genericMethod.myGenericMethod(integers).getClass());

        //#3
        Generic<String> generic = new Generic<>("generic");
        System.out.println("#3 "+generic.getName());

        //#4
        System.out.println("#4 "+generic.getFirst(integers));

        //#5
        integers.add(100);
        System.out.println("#5 "+generic.getLast(integers));

        //#6
        List<Integer> integerList = genericMethod.myGenericMethod2(1,2,3,4,5);
        Iterator<Integer> integerIterator = integerList.iterator();
        System.out.print("#6 ");
        while (integerIterator.hasNext()){
            System.out.print(integerIterator.next());
        }
        System.out.println();

        //#7
        //error , 改泛型方法参数类型必须继承 Number
        //List<String> stringList = genericMethod.myGenericMethod3("a","b","c");
        //Iterator<String> stringIterator = stringList.iterator();
        //System.out.print("#7 ");
        //while (stringIterator.hasNext()){
        //    System.out.print(stringIterator.next());
        //}
        //System.out.println();


    }

    public <T> T myGenericMethod(List<T> tList) {
        return tList.get(0);
    }

    /**
     * 可变参
     * @param args
     * @param <T>
     */
    public <T> List<T> myGenericMethod2(T ... args) {
        List<T> tList = new ArrayList<>();
        for(T t : args){
            tList.add(t);
        }
        return tList;
    }

    /**
     * 定义参数的边界
     * @param args
     * @param <T>
     */
    public <T extends Number> List<T> myGenericMethod3(T ... args) {
        List<T> tList = new ArrayList<>();
        for(T t : args){
            tList.add(t);
        }
        return tList;
    }

    private static class Generic<T> {
        private T name;
        public Generic(T name){
            this.name = name;
        }

        public T getName() {
            return name;
        }

        public <E> E getFirst(List<E> eList){
            return eList.get(0);
        }

        /**
         * 泛型类中，泛型方法的 T 可以与类的 T 不同
         * @param eList
         * @param <T>
         * @return
         */
        public <T> T getLast(List<T> eList){
            return eList.get(eList.size()-1);
        }
    }
}
