package com.kosta.day07;

public class 다형성연습 {
    public static void main(String[] args) {
        Account account = new Account("111-1111", "bae", 1000);
        CheckingAccount checkingAccount = new CheckingAccount("112-1111", "kim", 3000, "0212");
        CreditLineAccount creditLineAccount = new CreditLineAccount("113-1111", "seo", 2000, 500);
        BonusAccount bonusAccount = new BonusAccount("114-1111", "lim", 5000, 10);

        accountDisplay(account);
        accountDisplay(checkingAccount);
        accountDisplay(creditLineAccount);
        accountDisplay(bonusAccount);
    }

    public static void accountDisplay(Account account) {
        System.out.println(account);
        System.out.println("---------------------------");
    }
}
