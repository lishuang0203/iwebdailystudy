package com.iweb.study.day05.factory;

import com.iweb.study.day05.service.impl.Apple;
import com.iweb.study.day05.service.impl.Orange;
import com.iweb.study.day05.service.Fruit;

/**
 * @Author Moro
 * @Date 2020/7/9 18:04
 * @title FruitFactory
 */
public class FruitFactory extends Factory {
    @Override
   public Fruit eatFruit(String message) {
        if (message.equals("橘子")){
            return new Orange();
        }
        if (message.equals("苹果")){
            return new Apple();
        }
        return null;
    }
}
