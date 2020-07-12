package com.iweb.study.day03.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author Moro
 * @Date 2020/7/6 16:24
 * @title Student
 * name  age birth  showInfo()
 */
public class Student {
    String name;
    int age;
    String birth;
    public Student(String name, int age, String birth) {
        this.name = name;
        this.age = age;
        this.birth = birth;
    }
    /*
    学生拥有方法：showInfo() 在showInfo中输出学生的基本信息
    生成3个学生实例，调用学生实例的showInfo方法
     */
    public void showInfo(){
        System.out.println(String.format("name = %s \tage = %s\t birth = %s ",name,age,birth));
    }

    public static void main(String[] args) {
        // 创建一个SimpleDateFormat对象同时设置格式
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String birth = sdf.format(date);
        Student student = new Student("张三", 15, birth);
        Student student1 = new Student("李四", 16, birth);
        Student student2 = new Student("王五", 17, birth);
        student.showInfo();
        student1.showInfo();
        student2.showInfo();
    }
}
