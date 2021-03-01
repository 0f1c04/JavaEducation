package com.kosta.day02;

public class forTest {
    public static void main(String[] args) {
        //test1();
        //test2();
        test3();
    }

    private static void test3() {
        //4단일때 중단
        outerFor:
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == 4) {
                    break outerFor;
                }
                System.out.println(i + "*" + j + "=" + i * j + "\t");
            }
        }
    }

    private static void test2() {
        //4단만 안나오게
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == 4) {
                    break;
                }
                System.out.println(i + "*" + j + "=" + i * j + "\t");
            }
        }
    }

    private static void test1() {
        //4단일때 중단
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                if (j == 4) {
                    break;
                }
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
