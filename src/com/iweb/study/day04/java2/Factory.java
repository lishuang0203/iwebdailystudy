package com.iweb.study.day04.java2;

/**
 * @Author Moro
 * @Date 2020/7/7 17:32
 * @title Factory
 */
public abstract class Factory {
    // 获取汽车类型
    public abstract Car getCar(String name);

    // 获取颜色
    public abstract Color getColor(String color);
}
