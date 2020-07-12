package com.iweb.study.day04.java2;

/**
 * @Author Moro
 * @Date 2020/7/7 17:33
 * @title BMWFactory
 */
public class BMWFactory extends Factory{

    @Override
    public Car getCar(String name) {
        if (name.equals("宝马")){
            return new BMW();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
