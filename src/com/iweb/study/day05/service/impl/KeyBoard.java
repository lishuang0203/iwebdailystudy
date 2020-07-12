package com.iweb.study.day05.service.impl;

import com.iweb.study.day05.service.USBService;

/**
 * @Author Moro
 * @Date 2020/7/9 16:14
 * @title KeyBoard
 */
public class KeyBoard implements USBService {
    // 敲击功能
    public void knock(){
        System.out.println("键盘敲击");
    }

    @Override
    public void open() {
        System.out.println("USB键盘开启了");
    }

    @Override
    public void close() {
        System.out.println("USB键盘关闭了");
    }
}
