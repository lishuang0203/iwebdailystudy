package com.iweb.study.day06;

import com.iweb.study.day04.java4.S;

import java.util.Date;

/**
 * @Author Moro
 * @Date 2020/7/10 11:00
 * @title ConstructorTest
 */
public class ConstructorTest {
    public static void main(String[] args) {
//        Person person = new Person("李爽", "男");
//        Person person1 = new Person();
//        new Person("李爽","nan",14,new Date());
        Sub sub = new Sub();
        System.out.println(sub);
    }
}
class Sub{

}
class Person{
    private String name;
    private String sex;
    private int age;
    private Date birth;



    public Person() {
    }

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Person(String name, String sex, int age, Date birth) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.birth = birth;
    }
}

