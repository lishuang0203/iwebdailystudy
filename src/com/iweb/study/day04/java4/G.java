package com.iweb.study.day04.java4;

/**
 * @Author Moro
 * @Date 2020/7/8 13:39
 * @title G
 */
public class G extends S {
    private int n = 20;
    {
        System.out.println("this is G");

    }

    public G() {
        System.out.println("G is init");
    }

    @Override
    public void run() {
        System.out.println(n);
    }
}
