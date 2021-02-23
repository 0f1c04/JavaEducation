package com.kosta.day07;

public class AccountTest {
    public static void main(String[] args) {
        method5();
    }

    private static void method5() {
        BonusAccount bonusAccount = new BonusAccount("111-1234", "bae", 1000, 50);
        bonusAccount.deposit(2000);
        System.out.println(bonusAccount.bonusPoint + " 포인트");
        bonusAccount.deposit(2000);
        System.out.println(bonusAccount.bonusPoint + " 포인트");
        System.out.println(bonusAccount);
    }

    private static void method4() {
        CreditLineAccount creditLineAccount = new CreditLineAccount("113-1123", "bae", 1000, 500);
        creditLineAccount.deposit(2000);
        System.out.println(creditLineAccount.withdraw(3500) + " 출금");
        System.out.println(creditLineAccount);
    }

    private static void method3() {
        //Object 생성 > Account 생성 > CheckingAccount 생성
        CheckingAccount checkingAccount = new CheckingAccount("112-1555", "hong", 1000, "0212");

        System.out.println(checkingAccount instanceof Object); //instanceof: 객체확인
        System.out.println(checkingAccount instanceof Account);
        System.out.println(checkingAccount instanceof CheckingAccount);
    }

    private static void method2() {
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setCardNo("0212");
        checkingAccount.pay("0212", 200);
        System.out.println(checkingAccount);
    }

    private static void method1() {
        Account account = new Account();
        account.setAccNo("111-1111");
        account.setOwnerName("홍길동");
        account.setBalance(1000);
        System.out.println(account);

        account.deposit(2000);
        System.out.println(account.withdraw(500));
        System.out.println(account);
    }
}
