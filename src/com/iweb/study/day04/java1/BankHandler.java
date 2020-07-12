package com.iweb.study.day04.java1;

import java.util.UUID;

/**
 * @Author Moro
 * @Date 2020/7/7 13:38
 * @title BankHandler
 */
public class BankHandler {
    private Bank[] banks = new Bank[10];


    // 开户
    public String addBank(Bank bank) {
        // 找到存放位置
        int index = getBankIndex();
        // 如果index = -1 则返回 “抱歉,银行用户已满”
        if (index == -1) {
            return "银行用户已满";
        }
        // index!=-1 保存用户，同时给用户一个卡号
        bank.setCard(UUID.randomUUID().toString().replace("-", "").toUpperCase());
        banks[index] = bank;
        return String.format("用户%s卡号为%s", bank.getName(), bank.getCard());

    }

    /*
        如果返回-1 说明没有位置了
     */
    private int getBankIndex() {
        for (int i = 0; i < banks.length; i++) {
            if (banks[i] == null) {
                return i;
            }
        }
        return -1;
    }


    // 存取款
    public double changeMoney(String card, double money) {
        // 找到用户卡号
        Bank bank = findByCard(card);
        if (bank == null) {
            System.out.println("用户" + card + "不存在");
        }
        // 返回用户的余额
        bank.setAccount(bank.getAccount() + money);
        return bank.getAccount();

    }
    //查看余额
    public double getMoney(String card){
        return findByCard(card).getAccount();
    }


    // 根据card 找到用户
    private Bank findByCard(String card) {
        for (int i = 0; i < banks.length; i++) {
            // 用传进来的card和遍历的bank的card比较
            if (card.equals(banks[i].getCard())) {
                return banks[i];
            }
        }
        return null;
    }
}
