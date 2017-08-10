package com.izhengyin.effective.java.chapter3.item12;

import com.alibaba.fastjson.JSON;
import com.izhengyin.effective.java.chapter3.item9.Student;

/**
 * Created by zhengyin on 2017/8/10 下午5:47.
 * Email  <zhengyin.name@gmail.com> .
 */

public class User implements Comparable<User>{
    private int userId;
    private int age;
    private String username;


    public User(int userId, int age, String username) {
        this.userId = userId;
        this.age = age;
        this.username = username;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /*
    @Override
    public int compareTo(User o) {
        if(o == null){
            throw new NullPointerException();
        }
        if(this.userId == o.userId){
            return 0;
        }
        if(this.userId > o.userId){
            return 1;
        }
        if(this.userId < o.userId){
            return -1;
        }
        if(o.userId > this.userId){
            return -1;
        }
        if(o.userId < this.userId){
            return 1;
        }
        return 0;
    }
    */

    /**
     *  按照 id 排序
     */
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof User)){
            return false;
        }
        if(obj == this){
            return true;
        }
        User user = (User)obj;
        if(this.userId == user.userId && this.age == user.age && this.username == user.username){
            return true;
        }
        return false;
    }


    /**
     *  先 age 排序，在按照 id 排序
     */
    @Override
    public int compareTo(User o) {
        if(o == null){
            throw new NullPointerException();
        }
        if(this.age > o.age){
            return 1;
        }
        if(this.age < o.age){
            return -1;
        }
        if(o.age > this.age){
            return -1;
        }
        if(o.age < this.age){
            return 1;
        }

        if(this.age == o.age ){
            if(this.equals(o)){
                return 0;
            }else{
                return this.userId > o.userId?1:-1;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
