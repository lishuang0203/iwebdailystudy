package com.iweb.study.day05.service.impl;

import com.iweb.study.day05.service.USBService;

/**
 * @Author Moro
 * @Date 2020/7/9 16:13
 * @title Mouse
 */
public class Mouse implements USBService {
    // 点击功能
    public void click(){
        System.out.println("鼠标点击");
    }

    @Override
    public void open() {
        System.out.println("USB鼠标开启了");
    }

    @Override
    public void close() {
        System.out.println("USB鼠标关闭了");
    }
}
