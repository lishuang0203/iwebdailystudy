package com.iweb.study.day04.java3;

/**
 * @Author Moro
 * @Date 2020/7/8 13:21
 * @title Son
 */
public class Son extends Father {
    private String level;

    public Son() {
        super();
    }

    public Son(String name, String sex, int age, String level) {
        super(name, sex, age);
        this.level = level;
    }

    @Override
    public String toString() {
        return "Son{" +
                "level='" + level + '\'' +
                '}';
    }

    @Override
    public void sing(String type) {
        System.out.println("儿子会唱"+type);
    }


}
