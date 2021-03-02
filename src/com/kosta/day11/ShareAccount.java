package com.kosta.day11;

public class ShareAccount {
    Account lee;
    Account sung;

    public ShareAccount(Account lee, Account sung) {
        super();
        this.lee = lee;
        this.sung = sung;
    }

    //이체하기(lee->sung)
    public synchronized void transfer() {
        int amount = lee.withdraw(100); //출금
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sung.deposit(amount); //입금
        System.out.println(amount + "..이체(lee->sung)");
    }

    //잔액얻기
    public int getTotal() {
        synchronized (this) {
            return lee.balance + sung.balance;
        }
    }
}
