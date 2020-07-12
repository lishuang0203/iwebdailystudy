package com.iweb.study.day04.java2;

/**
 * @Author Moro
 * @Date 2020/7/7 17:56
 * @title WhiteFactory
 */
public class WhiteFactory extends Factory {

    @Override
    public Car getCar(String name) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color.equals("白色")){
            return new White();
        }
        return null;
    }
}
