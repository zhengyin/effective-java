package com.izhengyin.effective.java.chapter4.item21;

/**
 * Created by zhengyin on 2017/8/12 下午4:50.
 * Email  <zhengyin.name@gmail.com> .
 */
public class FnArray {
    public static int max(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int min(int[] arr){

        //todo

        return 0;
    }
}
