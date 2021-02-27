package com.kosta.day10;

import java.util.Objects;

public class ObjectTest2 {
    public static void main(String[] args) {

        long start1 = System.currentTimeMillis();
        long start2 = System.nanoTime();

        for (int i = 0; i < 1000000000; i++) {

        }

        System.out.println("for문이 도는데 걸린 시간");
        long end1 = System.currentTimeMillis() - start1;
        long end2 = System.nanoTime() - start2;
        System.out.println(end1);
        System.out.println(end2);

        if (method2()) {
            System.out.println("null이네용");
            //함수 빠지기 : return;
            //프로그램 종료
            System.exit(0); //일반적으로 정상종료는 0
        } else {
            System.out.println("null이아니네용");
        }
    }

    private static boolean method2() {
        Book b1 = null;
        System.out.println(b1 == null);
        System.out.println(Objects.isNull(b1));

        return Objects.isNull(b1);
    }

    private static void method1() {
        Book b1 = new Book("자바", 2000, true);
        Book b2 = new Book("자바", 2000, false);

        boolean result = Objects.equals(b1, b2);
        System.out.println(result);
    }
}
