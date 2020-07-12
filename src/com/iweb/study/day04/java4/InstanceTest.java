package com.iweb.study.day04.java4;

/**
 * @Author Moro
 * @Date 2020/7/8 14:04
 * @title InstanceTest
 */
public class InstanceTest {
    public static void main(String[] args) {
        String[] arr = new String[]{"gg","jj","dd","mm"};
        for (String s : arr) {
            System.out.println(s);
        }
        for (int index = 0; index< arr.length; index++) {
            System.out.println(arr[index]);
        }
    }
}
