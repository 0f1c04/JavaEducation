package com.kosta.day02;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름>>");
        String name = sc.next();

        System.out.print("나이>>");
        int age = sc.nextInt();

        System.out.print("주소>>");
        sc.nextLine();
        String addr = sc.nextLine();

        System.out.println(name + " " + age + " " + addr);
    }

}
