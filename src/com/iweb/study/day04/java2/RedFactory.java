package com.iweb.study.day04.java2;

/**
 * @Author Moro
 * @Date 2020/7/7 17:55
 * @title RedFactory
 */
public class RedFactory extends Factory {
    @Override
    public Car getCar(String name) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color.equals("红色")) {
            return new Red();
        }
        return null;
    }
}
