package com.iweb.study.day03;

/**
 * @Author Moro
 * @Date 2020/7/6 14:01
 * @title Teacher
 */
public class Teacher {
    String name;
    String message;
    public void teach(Student student){
        System.out.printf("%s教%s\n",name,message);

        student.study(message);
    }
}
