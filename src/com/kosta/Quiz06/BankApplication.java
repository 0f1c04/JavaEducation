package com.kosta.Quiz06;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        boolean run = true;
        while(run) {
            System.out.println("------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("------------------------------------------");
            System.out.print("선택> ");

            int selectNo = Scanner.nextInt();

            if(selectNo == 1) {
                createAccount();
            }else if(selectNo == 2) {
                accountList();
            }else if(selectNo == 3) {
                deposit();
            }else if(selectNo == 4) {
                withraw();
            }else if(selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }

    //계좌생성하기
    private static void createAccount() {
        String ano;
        String owner;
        int balance;

        System.out.println("------");
        System.out.println("계좌생성");
        System.out.println("------");

        new Account()
    }

    //계좌목록보기
    private static void accountList() {

    }

    //예금하기
    private static void deposit() {

    }

    //출금하기
    private static void withraw() {

    }

    //Account 배열에서 ano와 동일한 Account 객체 찾기
    private static Account findAccount(String ano) {

    }
}
