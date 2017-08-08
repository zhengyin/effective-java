package com.izhengyin.effective.java.chapter2.item6;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * Created by zhengyin on 2017/8/7 下午3:35.
 * Email  <zhengyin.name@gmail.com> .
 */
public class WeakDemo {

    public static String testWeakRef(){
        String abc = new String("abc");
        WeakReference<String> s = new WeakReference<String>(abc);       // 弱引用
        abc = null;
        System.out.println("System.gc() : before => "+s.get());
        System.gc();
        System.out.println("System.gc() : after => "+s.get());
        return s.get();
    }

    public static String testWeakRefContrast(){
        String abc = new String("abc");
        String s1 = abc;
        abc = null;
        System.out.println("System.gc() : before => "+s1);
        System.gc();
        System.out.println("System.gc() : after => "+s1);
        return s1;
    }

    public static Map<String,Integer> testWeakHashMap(){
        Map<String,Integer> map = new WeakHashMap<>();
        String key1 = "key1";      // 此声明的字符串,存储在 栈区
        String key2 = new String("key2");  // 此声明的字符串，存储在 堆区
        map.put(key1,1);
        map.put(key2,2);
        key1 = null;        //释放 ，不在堆区 Gc 不会回收
        key2 = null;        //释放 , Gc 回收
        System.out.println("System.gc() : before => "+map);
        System.gc();
        System.out.println("System.gc() : after => "+map);
        return map;
    }

    public static Map<String,Integer> testWeakHashMapContract(){
        Map<String,Integer> map = new HashMap<>();
        String key1 = "key1";      // 此声明的字符串,存储在 Stack
        String key2 = new String("key2");  // 此声明的字符串，存储在 heap
        map.put(key1,1);
        map.put(key2,2);
        key1 = null;        //释放 ，不在 Heap Gc 不会回收
        key2 = null;        //释放 , Gc 回收
        System.out.println("System.gc() : before => "+map);
        System.gc();
        System.out.println("System.gc() : after => "+map);
        return map;
    }

    public static void main(String[] args)  {
        System.out.println("testWeakRef() "+testWeakRef());
        System.out.println("testWeakRefContrast() "+testWeakRefContrast());
        System.out.println("testWeakHashMap() "+testWeakHashMap());
        System.out.println("testWeakHashMapContract() "+testWeakHashMapContract());
    }

}
