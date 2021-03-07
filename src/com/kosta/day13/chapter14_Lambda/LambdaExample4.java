package com.kosta.day13.chapter14_Lambda;

import java.util.function.Predicate;

public class LambdaExample4 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        Predicate<String> p = a -> {
            return a.length() >= 3;
        };
        System.out.println(p.test("hello"));
    }
}
