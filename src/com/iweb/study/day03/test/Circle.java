package com.iweb.study.day03.test;

import java.util.Scanner;

/**
 * @Author Moro
 * @Date 2020/7/6 16:25
 * @title Circle
 * <p>
 * 写一个判断点是否在圆内的方法。
 * 思路：
 * 设计一个圆类，拥有属性圆的半径
 * 圆类设计一个方法判断 一个点是否在圆内
 * <p>
 * 测试：输入坐标x,y 返回 boolean 值
 * 数据用 Scanner来接收
 */
public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public boolean isIn(double x, double y) {
        // 如果x²+y² <= r² 在圆内
        if (x * x + y * y <= radius * radius) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("请输入x的坐标：");
        double x = scanner.nextDouble();
        System.out.println("请输入y的坐标：");
        double y = scanner.nextDouble();
        boolean result = circle.isIn(x, y);
        // 将判断的值转成String
        String str = String.valueOf(result);
        // 输出结果
        if (str == "true") {
            System.out.println("点(" + x + "," + y + ")在半径为" + radius + "的圆上");
        } else {
            System.out.println("点(" + x + "," + y + ")不在半径为" + radius + "的圆上");
        }

    }
}
