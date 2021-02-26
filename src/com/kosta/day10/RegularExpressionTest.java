package com.kosta.day10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionTest {
    public static void main(String[] args) {
        method4();
    }

    private static void method4() {
        String phone = "010-7788-6969";
        String exp = "([01]{3})-([0-9]{4})-([0-9]{4})";

        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(phone);
        boolean b = m.find();
        System.out.println(b);
        if(b) {
            System.out.println(m.group());
            System.out.println(m.group(1));
            System.out.println(m.group(2));
            System.out.println(m.group(3));
        }
    }

    private static void method3() {
        String name = "홍 길동";
        String exp = "([가-힣]{1}) ([가-힣]{2})";

        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(name);
        boolean b = m.find();
        if(b) {
            System.out.println(m.group());
            System.out.println(m.group(1));
            System.out.println(m.group(2));
        }
    }

    private static void method2() {
        String name = "홍길동";
        String exp = "[가-힣]+";

        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(name);
        boolean b = m.find();
        System.out.println(b);
    }

    private static void method1() {
        //System.out.println("자바\t프로\n그래밍");
        String phone = "010-778-6969";
        String exp = "[01]{3}-[0-9]{3,4}-\\d{4}";
        boolean result = Pattern.matches(exp, phone);
        System.out.println(result);
    }
}

/**
 * ~ 틸드
 * ^ 캐럿
 * ` 백틱
 * , 콤마
 * ; 세미콜론
 * : 콜론
 * " 더블쿼테이션
 * ' 싱글쿼테이
 */

/**
 * RegularExpression
 * [] 선택    [abc] [a-z]
 * - 범위     [A-Za-z0-9] A~Z, a~z, 0~9 중 하나
 * ^ 제외     [^a-z] 소문자는 ㄴㄴ
 * ^[] 시작   ^a
 * $ 끝
 * {숫자} 자리수
 * {숫자1, 숫자2} 숫자1 ~ 숫자2
 * ? 0개 또는 1개   a?
 * * 0개 이상      a* a가 0개 이상
 * + 1개 이상      a+ a가 1개 이상
 */
