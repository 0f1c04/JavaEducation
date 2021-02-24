package com.kosta.day06.inherit;

public class AccountTest {
    public static void main(String[] args) {
        method2();
    }

    private static void method2() {
        CheckingAccount checkingAccount = new CheckingAccount("112-1888", "kim", 1000, "7878");
        checkingAccount.deposit(2000);
        System.out.println(checkingAccount.withdraw(500) + "출금");
        System.out.println(checkingAccount);

        System.out.println(checkingAccount.pay("7878", 600) + "출금");
        System.out.println(checkingAccount);
    }

    private static void method1() {
        Account account = new Account("112-1888", "kim", 1000);
        account.deposit(2000);
        System.out.println(account.withdraw(500) + "출금");
        System.out.println(account);
    }
}
