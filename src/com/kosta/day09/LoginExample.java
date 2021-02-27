package com.kosta.day09;

import java.util.Scanner;

public class LoginExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID 입력: ");
        String id = sc.next();
        System.out.print("Password 입력: ");
        String password = sc.next();

        try {
            login(id, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            sc.close();
            return;
        }
        sc.close();
    }

    private static void login(String id, String password) throws NotExistsIDException, WrongPasswordException {
        //id가 "blue"가 아니라면 NotExistIDException 발생시킴
        if (!id.equals("blue")) {
            throw new NotExistsIDException("아이디가 존재하지 않습니다.");
        }

        //password가 "12345"가 아니라면 NotExistIDException 발생시킴
        if (!password.equals("12345")) {
            throw new WrongPasswordException("패스워드가 틀립니다.");
        }
    }
}
