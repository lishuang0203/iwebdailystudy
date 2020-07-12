package com.iweb.study.day05.factory;

import com.iweb.study.day04.java4.S;
import com.iweb.study.day05.service.Operation;

/**
 * @Author Moro
 * @Date 2020/7/9 18:42
 * @title OperationFactory
 */
public abstract class OperationFactory {
   public abstract Operation getOperation(String message);
}
