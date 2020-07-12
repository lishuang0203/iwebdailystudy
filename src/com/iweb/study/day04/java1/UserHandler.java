package com.iweb.study.day04.java1;

/**
 * @Author Moro
 * @Date 2020/7/7 10:23
 * @title UserHandler
 */
public class UserHandler {
    // 数据校验
    private boolean validateUser(User user) {
        return user.getUsername().length() > 0 && user.getPassword().length() > 0;
    }


    // 校验合法性
    public boolean register(String username, String password) {
        // 创建对象
        User user = new User(username, password);

        // 判断数据合法性
        boolean flag = validateUser(user);
        if (flag) {
            return true;
        }
        return false;
    }


    // 登录
    public boolean login(String username,String password){
        User user = new User(username, password);
        // 判断数据合法
        boolean flag =  validateUser(user);
        if (!flag){
            return  false;
        }
        if (username.equals("admin")&&password.equals("123456")){
            return true;
        }
        return false;


    }
}
