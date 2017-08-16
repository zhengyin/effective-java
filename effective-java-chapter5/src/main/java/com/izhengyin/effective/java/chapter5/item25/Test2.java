package com.izhengyin.effective.java.chapter5.item25;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zhengyin on 2017/8/16 下午2:03.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Test2 {

    public static void main(String[] args){
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        System.out.println(reduce(strings,new StringFunc(),""));
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        System.out.println(reduce(integers,new IntegerFunc(),0));
        List<Double> doubles = new ArrayList<>();
        doubles.add(1.2);
        doubles.add(2.2);
        doubles.add(3.2);
        System.out.println(reduce(doubles,new DoubleFunc(),1.0));
    }

    private static <T> T reduce(List<T> list , Function<T> function , T initVal){
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()){
            T t = iterator.next();
            initVal = function.apply(initVal,t);
        }
        return initVal;
    }

    private static class StringFunc implements Function<String> {
        @Override
        public String apply(String t1, String t2) {
            return t1+t2;
        }
    }
    private static class IntegerFunc implements Function<Integer> {
        @Override
        public Integer apply(Integer t1, Integer t2) {
            return t1+t2;
        }
    }
    private static class DoubleFunc implements Function<Double> {
        @Override
        public Double apply(Double t1, Double t2) {
            return t1*t2;
        }
    }
}
