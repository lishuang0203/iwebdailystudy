package com.iweb.study.day05;


import com.iweb.study.day05.factory.FruitFactory;
import com.iweb.study.day05.factory.PrintFactory;
import com.iweb.study.day05.service.Fruit;
import com.iweb.study.day05.service.Operation;
import com.iweb.study.day05.service.impl.ColorPrint;
import com.iweb.study.day05.service.impl.KeyBoard;
import com.iweb.study.day05.service.impl.Mouse;

/**
 * @Author Moro
 * @Date 2020/7/9 16:38
 * @title TaskTest
 */
public class TaskTest {
    public static void main(String[] args) {
//        Laptop laptop = new Laptop();
//        laptop.start();
//        laptop.useUSB(new Mouse());
//        laptop.useUSB(new KeyBoard());
//        laptop.end();
//        FruitFactory fruitFactory = new FruitFactory();
//        Fruit orange = fruitFactory.eatFruit("橘子");
//        Fruit apple = fruitFactory.eatFruit("苹果");
//        orange.eat();
//        apple.eat();

        PrintFactory printFactory = new PrintFactory();
        Operation print = printFactory.getOperation("彩色");
        print.print();
        print.fax();

        print = printFactory.getOperation("黑色");
        print.print();
        print.scan();



    }
}
