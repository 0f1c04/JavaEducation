package com.kosta.day11;

public class SynchronizedTest {
    public static void main(String[] args) {
        Account sung = new Account("111", "성춘향", 1000);
        Account lee = new Account("222", "이몽룡", 2000);
        ShareAccount shareAccount = new ShareAccount(lee, sung);
        Thread t1 = new PrintThread(shareAccount);
        Thread t2 = new TransferThread(shareAccount);
        t1.start();
        t2.start();
    }
}
