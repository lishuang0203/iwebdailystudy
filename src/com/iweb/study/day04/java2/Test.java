package com.iweb.study.day04.java2;

/**
 * @Author Moro
 * @Date 2020/7/7 17:34
 * @title Test
 */
public class Test {
    public static void main(String[] args) {
        // 创建奥迪工厂对象
        Car a = new AudiFactory().getCar("奥迪");
        // 创建宝马工厂对象
        Car b  = new BMWFactory().getCar("宝马");
        // 调用run方法
        a.run();
        b.run();
        // 创建红色工厂对象
        Color c = new RedFactory().getColor("红色");
        // 创建白色工厂对象
        Color d = new WhiteFactory().getColor("白色");
        // 调用color方法
        c.color();
        d.color();
    }
}
