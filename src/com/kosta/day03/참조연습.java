package com.kosta.day03;

public class 참조연습 {
    public static void main(String[] args) {
        // sample();
        // sample2();
        sample3();
    }

    private static void sample3() {
        // 참조형은 일반적으로 null로 초기화
        String s = null;
        System.out.println(s);
        System.out.println(s.length());
    }

    private static void sample2() {
        int a = 0;
        double d = 0.0;
        boolean b = false;
        char c = ' ';
        System.out.println(a + d);
        System.out.println(b);
        System.out.println(c);

    }

    private static void sample() {
        String s1 = "홍길동";
        String s2 = "홍길동";
        String s3 = "홍길동";
        String s4 = "홍길동";
        // s1, s2는 주소가 같음, s3, s4는 주소가 다름
        System.out.println(s1 == s2); // true
        System.out.println(s3 == s4); // false

        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));
    }
}
