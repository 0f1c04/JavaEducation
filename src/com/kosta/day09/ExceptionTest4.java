package com.kosta.day09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//예외발생
//1)자동 ... 실행시 자동. 컴파일시.
//2)강제발생 ... throw 예외이름

public class ExceptionTest4 {
    public static void main(String[] args) {
        try {
            method6();
        } catch (MyException e) {
            System.out.println(e.getMessage());
            System.out.println(e.message2);
            e.print();
        }
        System.out.println("main end");
    }

    private static void method6() throws MyException {
        System.out.println("method start");
        int score = 70;
        if (score <= 70) throw new MyException("70이상만 가능");

        System.out.println("method end");
    }

    private static void method5() throws IOException {
        int score = 70;
        if (score <= 70) throw new IOException("70이상만 가능");
        //예외를 일으키고 처리는 하지않음 -> 프로그램 중단
        System.out.println("method3 end");
    }

    private static void method4() {
        int score = 70;
        try {
            if (score <= 70) throw new RuntimeException("70이상만 가능"); //예외 강제발생
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("method4 end");
    }

    private static void method3() {
        int score = 70;
        if (score <= 70) throw new RuntimeException("70이상만 가능");
        //예외를 일으키고 처리는 하지않음 -> 프로그램 중단
        System.out.println("method3 end");
    }

    private static void method2() {
        try {
            FileReader fr = new FileReader("aa");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void method1() {
        int a = 10 / 0;
    }
}
