package com.iweb.study.day05.service.impl;

import com.iweb.study.day05.service.Operation;

/**
 * @Author Moro
 * @Date 2020/7/9 18:40
 * @title Black
 */
public class Black implements Operation {
    @Override
    public void print() {
        System.out.println("黑色打印");
    }

    @Override
    public void scan() {
        System.out.println("黑色打印机开始扫描");
    }

    @Override
    public void fax() {

    }
}
