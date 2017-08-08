package com.izhengyin.effective.java.chapter2.item6;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhengyin on 2017/8/7 下午3:24.
 * Email  <zhengyin.name@gmail.com> .
 */
public class OutMemory {


    private static final int DEFAULT_CAPACITY = 10;
    private static Object[] elements;
    private static int size = 0;

    static {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void push(Object els){
        ensureCapacity();
        elements[size] = els;
        size ++;
    }


    public Object pop(){
        if(size < 0){
            throw new EmptyStackException();
        }
        size -- ;
        Object els = elements[size];
        return els;
    }


    /**
     *  确保 elements 空间在不够时，动态扩容一倍
     */
    private static void ensureCapacity(){
        if(elements.length == size){
            elements = Arrays.copyOf(elements,elements.length + DEFAULT_CAPACITY );
        }
    }

    public static void trace(){
        long total1 = Runtime.getRuntime().totalMemory();
        long total2 = Runtime.getRuntime().freeMemory();
        System.out.println("elements length : "+ elements.length + " size : "+ size +" useMoney : "+ ((total1-total2)/(1024*1024)) +"m");
    }

    /**
     * JInfo VM Flags:
     Non-default VM flags: -XX:CICompilerCount=4 -XX:InitialHeapSize=33554432 -XX:MaxHeapSize=67108864 -XX:MaxNewSize=22020096 -XX:MinHeapDeltaBytes=524288 -XX:NewSize=11010048 -XX:OldSize=22544384 -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseFastUnorderedTimeStamps -XX:+UseParallelGC
     Command line:  -Xms32m -Xmx64m -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=55045:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        OutMemory outMemory1 = new OutMemory();
        for(int m=0;m<100;m++){
            for(int i=0;i<10000;i++){
                StringBuilder sb = new StringBuilder();
                for(int v=0;v<(m*10);v++){
                    sb.append(i);
                }
                outMemory1.push(sb);
            }
            OutMemory.trace();
            for(int n=0;n<10000;n++){
                outMemory1.pop();
            }
            OutMemory.trace();
            TimeUnit.SECONDS.sleep(1);
        }

    }
}
