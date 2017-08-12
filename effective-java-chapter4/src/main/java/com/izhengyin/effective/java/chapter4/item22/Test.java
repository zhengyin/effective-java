package com.izhengyin.effective.java.chapter4.item22;

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
        Person person = new Person();
        person.setName("张三");
        person.setAge(12);

        Person.Interest[] interests = new Person.Interest[2];
        interests[0] = new Person.Interest("羽毛球","3年");
        interests[1] = new Person.Interest("乒乓球","2年");

        person.setInterests(interests);

        System.out.println(person);
    }
}
