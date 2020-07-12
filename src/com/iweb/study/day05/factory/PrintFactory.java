package com.iweb.study.day05.factory;

import com.iweb.study.day05.service.Operation;
import com.iweb.study.day05.service.impl.Black;
import com.iweb.study.day05.service.impl.ColorPrint;

/**
 * @Author Moro
 * @Date 2020/7/9 18:43
 * @title ColorFactory
 */
public class PrintFactory extends OperationFactory {
    @Override
    public Operation getOperation(String message) {
        if (message.equals("彩色")){
            return new ColorPrint();
        }
        if (message.equals("黑色")){
            return new Black();
        }
        return null;
    }
}
