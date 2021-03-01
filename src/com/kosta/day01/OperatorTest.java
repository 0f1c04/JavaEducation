package com.kosta.day01;

public class OperatorTest {

    public static void main(String[] args) {
        // method1();
        // method2();
        // method3();
        // method4();
        // method6();
        method7();
    }

    private static void method7() {
        // 3항 연산자
        int score = 95;
        int limit = 80;
        String result = score >= limit ? "합격" : "불합격";
        System.out.println(result);

        // 3항 연산자x if문 사용
        if (score >= limit)
            result = "합격";
        else
            result = "불합격";
        System.out.println(result);
    }

    private static void method6() {
        // 논리연산자 (||, |)
        int a = 10;
        int b = 20;
        // || : 하나라도 참이면 참. 앞 결과가 true라면 뒷 조건은 수행x
        // | : 하나라도 참이면 참. 모주건 모든 조건을 수행o
        // boolean result = a < 10 || ++b >= 20;
        boolean result = a >= 10 | ++b >= 20;
        System.out.println("result=" + result);
        System.out.println("b=" + b);
    }

    private static void method5() {
        // 논리연산자 (&&, &)
        int a = 10;
        int b = 20;
        // && : 모두 참이면 참. 앞 결과가 false라면 뒷 조건은 수행x
        // & : 모두 참이면 참. 모주건 모든 조건을 수행o
        // boolean result = a < 10 && ++b >= 20;
        boolean result = a < 10 & ++b >= 20;
        System.out.println("result=" + result);
        System.out.println("b=" + b);
    }

    private static void method4() {
        // 비교연산자
        int a = 10;
        int b = 20;
        System.out.println(a == b);

        // "자바"라는 문자는 String클래스로 만들어진 객체(실체)인가요?
        System.out.println("자바" instanceof String);
    }

    private static void method3() {
        // 증감연산자2
        int a = 10;
        int b = 20;
        int result = a++ + ++b;

        System.out.println(result);
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }

    private static void method2() {
        // 증감연산자
        int a = 10;
        a++;
        ++a;
        a += 1;
        a = a + 1;

        // 증가하고 출력
        System.out.println("a= " + ++a); // 전위연산자
        // 출력하고 증가
        System.out.println("a= " + a++); // 후위연산자

        System.out.println("a= " + a);
    }

    private static void method1() {
        // 산술연산자 : +, -, *, /
        int a = 10;
        int b = 3;
        System.out.println("몫은 " + a / b);
        System.out.println("나머지는 " + a % b);
        System.out.println("실수결과 " + (double) a / b);
        System.out.println("실수결과 " + a / (double) b);
        System.out.println("실수결과 " + 1.0 * a / b);
    }
}
