package com.iweb.study.day04.java4;

/**
 * @Author Moro
 * @Date 2020/7/8 13:38
 * @title F
 */
public class F {
    private int n = 12;
    public void run(){
        System.out.println(n);
    }
    public F(){
        System.out.println("F is init");
    }
    static {
        System.out.println("this is F");
    }

}
