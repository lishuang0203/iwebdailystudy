package com.iweb.study.day04.java4;

/**
 * @Author Moro
 * @Date 2020/7/8 13:39
 * @title S
 */
public class S extends F {
    private int n = 2;
    public S() {
        System.out.println("S is init");
    }

    public void run(){
        System.out.println(n);
    }
    {
        System.out.println("this is S");
    }

}
