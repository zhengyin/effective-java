package com.izhengyin.effective.java.chapter4.item22;

/**
 * Created by zhengyin on 2017/8/12 下午4:58.
 * Email  <zhengyin.name@gmail.com> .
 */
public class Person {

    private String name;
    private int age;
    private Interest[] interests;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Interest[] getInterests() {
        return interests;
    }

    public void setInterests(Interest[] interests) {
        this.interests = interests;
    }
    // 成员类不要求访问外围实例，就要始终用 static 修饰
    public static class Interest{
        private final String name;
        private final String howTime;

        public Interest(String name, String howTime) {
            this.name = name;
            this.howTime = howTime;
        }

        public String getName() {
            return name;
        }

        public String getHowTime() {
            return howTime;
        }
    }
    @Override
    public String toString() {
        String s = this.name + " 有 "+ interests.length+" 项爱好 ， 它们是 \n ";
        for(int i=0;i<interests.length;i++){
            s += interests[i].getName()+" 坚持了 "+ interests[i].getHowTime() +"\n";
        }
        return s;
    }
}
