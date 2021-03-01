package com.kosta.day02;

public class 조건문 {

    public static void main(String[] args) {
        // ifTest();
        // ifElseTest();
        ifElseIfElse();
    }

    private static void ifElseIfElse() {
        int score = 100;
        char grade;
        if (score >= 90) {
            grade = 'A';
            if (score >= 95) {
                grade = '+';
            } else {
                grade = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("your grade is " + grade);
    }

    private static void ifElseTest() {
        int score = 100;

        // if-else문
        if (score >= 60) {
            // 조건 결과가 참인 경우 실행
            System.out.println("합");
        } else {
            // 조건 결과가 거짓인 경우 실행
            System.out.println("불합");
        }

        // 3항 연산자
        System.out.println(score >= 60 ? "합" : "불합");
    }

    private static void ifTest() {
        int score = 100;

        // if문
        if (score >= 90) {
            System.out.println("합");
        }

        // 3항 연산자
        System.out.println(score >= 90 ? "합" : "");
    }

}
