package com.iweb.study.day05;

/**
 * @Author Moro
 * @Date 2020/7/9 14:34
 * @title Test
 */
public class Test {



    {
        // 非法向前引用
        System.out.println("静态代码块1"+this.name);

    }

    static{
        System.out.println("静态代码块2");
    }
    private String name = "tom";

    {
        System.out.println("代码块加载");
    }

    public static void main(String[] args) {
        new Test();
    }
}
