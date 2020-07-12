package com.iweb.study.day04.java2;

/**
 * @Author Moro
 * @Date 2020/7/7 17:33
 * @title AudiFactory
 */
public class AudiFactory extends Factory {

    @Override
    public Car getCar(String name) {
        if (name.equals("奥迪")){
            return new Audi();
        }
        return  null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
