package com.iweb.study.day06;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author Moro
 * @Date 2020/7/10 10:35
 * @title AndTest
 */
public class AndTest {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        String format = sdf.format(date);
        System.out.println(format);
    }
}
