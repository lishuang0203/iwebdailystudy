package com.iweb.study.day03;

/**
 * @Author Moro
 * @Date 2020/7/6 14:05
 * @title HelloMain
 */
public class HelloMain {


    public void change(int number) {
        number = 200;
    }

    // 引用数据类型
    public void changeUser(User user) {
        user.age = 20;
    }

    public void changeString(String word) {
        word = "world";
    }


    public static void main(String[] args) {
        HelloMain helloMain = new HelloMain();
//        int number = 100;
//        System.out.println(number);// 调用change之前
//        helloMain.change(number);
//        System.out.println(number); // 调用change之后


        User user = new User();
        user.age = 10;
        System.out.println(user.age);
        helloMain.changeUser(user);
        System.out.println(user.age);


    }
}

class User {
    int age;
}
