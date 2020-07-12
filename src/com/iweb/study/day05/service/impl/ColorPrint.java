package com.iweb.study.day05.service.impl;

import com.iweb.study.day05.service.Operation;

/**
 * @Author Moro
 * @Date 2020/7/9 18:39
 * @title ColorPrint
 */
public class ColorPrint implements Operation {
    @Override
    public void print() {
        System.out.println("彩色打印");
    }

    @Override
    public void scan() {

    }

    @Override
    public void fax() {
        System.out.println("彩色打印机开始传真");
    }
}
