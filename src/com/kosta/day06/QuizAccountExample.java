package com.kosta.day06;

/**
 * @author f1c04
 * Service
 */

//19.
public class QuizAccountExample {
    public static void main(String[] args) {
        QuizAccount quizAccount = new QuizAccount();

        quizAccount.setBalance(10000);
        System.out.println("현재 잔고: " + quizAccount.getBalance());

        quizAccount.setBalance(-100);
        System.out.println("현재 잔고: " + quizAccount.getBalance());

        quizAccount.setBalance(2000000);
        System.out.println("현재 잔고: " + quizAccount.getBalance());

        quizAccount.setBalance(300000);
        System.out.println("현재 잔고: " + quizAccount.getBalance());
    }
}
