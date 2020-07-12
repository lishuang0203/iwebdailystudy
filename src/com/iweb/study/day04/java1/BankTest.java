package com.iweb.study.day04.java1;

/**
 * @Author Moro
 * @Date 2020/7/7 17:12
 * @title BankTest
 */
public class BankTest {
    public static void main(String[] args) {
        // 开户测试
        Bank bank = new Bank();
        bank.setId(1);
        bank.setAccount(100.0);
        bank.setName("小李");
        bank.setPassword("1234567");
        bank.setPhone("213124214214");
        BankHandler bankHandler = new BankHandler();
        String message = bankHandler.addBank(bank);
        System.out.println(message);

        // 存钱测试
        double account = bankHandler.changeMoney(bank.getCard(), 1000.00);
        System.out.println(account);

        double money = bankHandler.getMoney(bank.getCard());
        System.out.println("用户" + bank.getName() + "的余额为：" + money);


    }
}
