package com.iweb.study.day03;

/**
 * @Author Moro
 * @Date 2020/7/6 14:32
 * @title HelloMain2
 */
public class HelloMain2 {
    String str = "AA";
    char[] c = {'a','b'};
    public void  change(String str,char[] c){
        str  = "A";
        c[0] = 'g';
    }

    public static void main(String[] args) {
        HelloMain2 helloMain2 = new HelloMain2();
        helloMain2.change(helloMain2.str,helloMain2.c);
        System.out.println(helloMain2.str);
        System.out.println(helloMain2.c);
    }
}
