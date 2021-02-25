package com.kosta.day09;

import sun.lwawt.macosx.CSystemTray;

public class ObjectTest {
    public static void main(String[] args) {
        method4();
    }

    private static void method4() {
        Car car1 = new Car("그랜져", 4000);
        Car car2 = new Car("그랜져", 4000);

        String car3 = new String("그랜져");

        System.out.println(car1 == car2);       //false
        System.out.println(car1.equals(car2));  //true equals 재정의함

        System.out.println(car1.equals(car3));  //true equals 재정의함

        //내용이 같다로 변경하고자한다.
        //==: 재정의불가
        //equals: 재정의가능
    }

    private static void method2() {
        String s1 = new String("자바");
        String s2 = new String("자바");
        String s3 = "자바";
        String s4 = "자바";

        System.out.println(s1 == s2 ? "같음" : "다름");
        System.out.println(s3 == s4 ? "같음" : "다름");
        System.out.println(s1.equals(s4) ? "내용같음" : "내용다름");
        System.out.println(s3.equals(s4) ? "내용같음" : "내용다름");

    }

    private static void method1() {
        int a1 = 10;
        int a2 = 10;

        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println(a1 == a2); //기본형은 값 비교         true
        System.out.println(obj1 == obj2); //객체는 주소비교      false
        System.out.println(obj1.equals(obj2)); //객체는 주소비교 false

        Integer a3 = 10;
        Integer a4 = 10;
        Integer b1 = new Integer(10);
        Integer b2 = new Integer(10);

        System.out.println(a3 == a4); //값을 비교  true
        System.out.println(b1 == b2); //주소를 비교 false

        System.out.println(b1.equals(b2)); //값을 비교 true
        //Object: ==는 주소비교, equals 주소비교
        //Integer: Object 상속
    }
}
