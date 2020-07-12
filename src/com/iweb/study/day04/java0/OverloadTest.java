package com.iweb.study.day04.java0;

/**
 * @Author Moro
 * @Date 2020/7/7 8:35
 * @title Overload
 */
public class OverloadTest {

    public void  show(){
        System.out.println("hello");
    }
    public void  show(int a, int b){
        System.out.println("show a b");
    }
    public void show(int a ,String word){
        System.out.println("show a word");
    }
    public void show(String b,int a ){
        System.out.println("show b a");
    }

    public static void main(String[] args) {
        OverloadTest overloadTest = new OverloadTest();
        overloadTest.show();// 根据参数列表决定调用哪个方法
        overloadTest.show(1,2);
        overloadTest.show(1,"aaa");
        overloadTest.show("aaa",1);
    }
}
