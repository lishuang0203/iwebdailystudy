
package com.iweb.study.day04.java1;

/**
 * @Author Moro
 * @Date 2020/7/7 8:53
 * @title Test
 */
public class Test {
    public static void main(String[] args) {
        UserHandler userHandler = new UserHandler();


        boolean login = userHandler.login("admin", "123456");
        System.out.println(login?"登陆成功":"登录失败");

        boolean register = userHandler.register("admin", "123456");
        System.out.println(register?"注册成功":"注册失败");

    }
}
