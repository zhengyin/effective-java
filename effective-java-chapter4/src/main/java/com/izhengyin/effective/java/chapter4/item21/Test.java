package com.izhengyin.effective.java.chapter4.item21;

/**
 * Created by zhengyin on 2017/8/12 下午4:53.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Test {

    /**
     * 像是使用函数一样 ， 比如  max(arr);
     * @param args
     */
    public static void main(String[] args){
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 0;
        arr[4] = 8;

        System.out.println(Fn.FN_ARRAY.max(arr));

        Fn.FN_ARRAY.min(arr);
    }
}
