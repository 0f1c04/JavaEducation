package com.kosta.day13.chapter14_Lambda;

@FunctionalInterface
interface Arg1Interface { void print(int num); }

@FunctionalInterface
interface Arg2Interface { int print(int num1, int num2); }

public class LambdaExample2 {
    public static void main(String[] args) {
        method3();
    }

    private static void method3() {
        Arg2Interface arg2Interface = (num1, num2) -> num1 * num2;
        int result = arg2Interface.print(3, 4);
        System.out.println(result);
    }

    private static void method2() {
        Arg2Interface arg2Interface = (num1, num2) -> {
            System.out.println(num1 + num2);
            System.out.println(num1 - num2);
            return num1 * num2;
        };
        int result = arg2Interface.print(3, 4);
        System.out.println(result);
    }

    private static void method1() {
        Arg1Interface arg1Interface = (num) -> {
            System.out.println(num + 10);
            System.out.println(num - 10);
        };
        arg1Interface.print(10);
    }
}
