package com.iweb.study.day04.java3;

import com.iweb.study.day04.java2.Factory;

/**
 * @Author Moro
 * @Date 2020/7/8 13:03
 * @title Father
 */
public abstract class Father {
    private String name;
    private String sex;
    private int age;


    public abstract void sing(String type);

    public Father() {
    }

    public Father(String name, String sex, int age) {
        this.name= name;
        this.sex = sex;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Father{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
