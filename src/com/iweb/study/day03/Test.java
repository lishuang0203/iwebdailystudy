package com.iweb.study.day03;

/**
 * @Author Moro
 * @Date 2020/7/6 14:03
 * @title Test
 */
public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "王老师";
        teacher.message = "java";

        Student student = new Student();
        student.name = "李四";

        teacher.teach(student);
    }
}
