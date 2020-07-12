package com.iweb.study.day05;

import com.iweb.study.day05.service.USBService;
import com.iweb.study.day05.service.impl.KeyBoard;
import com.iweb.study.day05.service.impl.Mouse;

/**
 * @Author Moro
 * @Date 2020/7/9 16:09
 * @title Laptop
 * <p>
 * <p>
 * 笔记本电脑（laptop）通常具备使用USB设备的功能。在生产时，笔记本都预留了可以插入USB设备的USB接口，
 * 但具体是什么USB设备，笔记本厂商并不关心，只要符合USB规格的设备都可以。
 * 定义USB接口，具备最基本的开启功能和关闭功能。鼠标和键盘要想能在电脑上使用，
 * 那么鼠标和键盘也必须遵守 USB规范，实现USB接口，否则鼠标和键盘的生产出来也无法使用。
 * 案例分析
 * 进行描述笔记本类，实现笔记本使用USB鼠标、USB键盘 USB接口，包含开启功能、关闭功能
 * 笔记本类，包含运行功能、关机功能、使用USB设备功能
 * 鼠标类，要实现USB接口，并具备点击的方法
 * 键盘类，要实现USB接口，具备敲击的方法
 */
public class Laptop  {
    public void useUSB(USBService usbService){
        // 判断该对象是否是USB接口子类的实例
       if (usbService instanceof  Mouse){
           usbService.open();
           ((Mouse) usbService).click();
           usbService.close();
       }
       if (usbService instanceof  KeyBoard){
           usbService.open();
           ((KeyBoard) usbService).knock();
           usbService.close();
       }

    }
    public void start(){
        System.out.println("电脑开机");
    }
    public void end(){
        System.out.println("电脑关机");
    }
}
