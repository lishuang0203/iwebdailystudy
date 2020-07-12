package com.iweb.study.day03.test;


import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @Author Moro
 * @Date 2020/7/6 16:58
 * @title User
 * <p>
 * <p>
 * 定义一个用户类包含属性：用户id、用户名、密码、手机号、生日、创建时间
 * 定义一个构造函数：接收用户id、用户名、密码、手机号、创建时间为系统当前时间，生日 缺省为null
 * 定义一个构造函数：接收用户id、用户名、密码，创建时间为系统当前时间，手机号、生日 缺省为null
 * 数据用 Scanner来接收
 */
public class User {
    int id;
    String name;
    String passwd;
    String phone;
    String birth;
    String creatTime;

    public User(int id, String name, String passwd, String phone, String creatTime) {
        this.id = id;
        this.name = name;
        this.passwd = passwd;
        this.phone = phone;
        this.creatTime = creatTime;
    }

    public User(int id, String name, String passwd, String creatTime) {
        this.id = id;
        this.name = name;
        this.passwd = passwd;
        this.creatTime = creatTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passwd='" + passwd + '\'' +
                ", phone='" + phone + '\'' +
                ", birth='" + birth + '\'' +
                ", creatTime=" + creatTime +
                '}';
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要输入的参数数量：");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("请输入您要输入的参数：");
        String[] values = new String[number];
        // 使用一个String数组接收输入的参数
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextLine();
        }
        // 声明一个User对象
        User user = null;
        // 获取当前系统时间并格式化
        long l = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String time = sdf.format(l);
        // 判断输入的参数数量
        if (number == 3) {
            // 定义属性
            int id = Integer.parseInt(values[0]);
            String name = values[1];
            String password = values[2];
            user = new User(id, name, password, time);
        } else if (number == 5) {
            int id = Integer.parseInt(values[0]);
            String name = values[1];
            String password = values[2];
            String phone = values[3];
            user = new User(id, name, password, phone, time);
        } else {
            System.out.println("您输入的数据有误");
        }
        // 输出
        System.out.println(user);
    }
}
