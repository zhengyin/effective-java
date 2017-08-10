package com.izhengyin.effective.java.chapter3.item8;

/**
 * Created by zhengyin on 2017/8/9 下午3:15.
 * Email  <zhengyin.name@gmail.com> .
 */
public class CaseInsensitiveString {
    private final String s;
    public CaseInsensitiveString(String s){
        if(s == null){
            throw new NullPointerException();
        }
        this.s = s;
    }


    /* 违反对称性
        CaseInsensitiveString s1 = new CaseInsensitiveString("ABC");
        String s2 = "abc";
        System.out.println(s1.equals(s2));  // true
        System.out.println(s2.equals(s1));  // false
    */
    /*
    @Override
    public boolean equals(Object o){
        if(o instanceof CaseInsensitiveString){
            return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
        }
        if(o instanceof String){
            return s.equalsIgnoreCase((String)o);
        }
        return false;
    }
    */

    @Override
    public boolean equals(Object o){
        if(o instanceof CaseInsensitiveString){
            return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
        }
        return false;
    }
}
