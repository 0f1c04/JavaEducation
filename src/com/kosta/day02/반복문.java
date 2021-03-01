package com.kosta.day02;

import java.util.Scanner;
// java.utill 패키지에 있는 Scanner 클래스 사용 가능
// java.lang 패키지에 들어있는 class는 언제나 사용 가능
// 다른 패키지에 들어있는 class들은 import하고 사용 가능

public class 반복문 {

    public static void main(String[] args) {
        // forTest();
        // whileTest();
        // doWhileTest();
        // forSum();
        // whileSum();
        // doWhileSum();

        // System.out : 표준출력(모니터)
        // System.in : 표준입력(키보드)

        // Scanner class : 표준입출력을 쉽게 하도록 도와주는 클래스
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        inputArgumentSum(num);

        // java.lang 패키지에 들어있는 class는 언제나 사용 가능
        // 다른 패키지에 들어있는 class들은 import하고 사용 가능
    }

    private static void inputArgumentSum(int limit) {
        int sum = 0;
        for (int i = 0; i < limit; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    private static void doWhileSum() {
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        } while (i <= 9);
        System.out.println(sum);
    }

    private static void whileSum() {
        int sum = 0;
        int i = 1;
        while (i <= 9) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

    private static void forSum() {
        // 1~10까지 더하기
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    private static void doWhileTest() {
        int sum = 0;
        do {
            sum += 1;
        } while (sum < 99);
        System.out.println(sum);
    }

    private static void whileTest() {
        int sum = 0;
        while (sum < 99) {
            sum += 1;
        }
        System.out.println(sum);
    }

    private static void forTest() {
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            sum += 1;
        }
        System.out.println(sum);
    }

}
