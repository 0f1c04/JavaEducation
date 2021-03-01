package com.kosta.day04;

public class CarTest {

    public static void main(String[] args) {
        //1.객체 참조 변수 선언
        Car c1;

        //2.객체 생성 //자동초기화
        c1 = new Car(); //heap영역에 instance가 생성, c1에는 object, instance주소가 들어감

        //3.객체 사용
        c1.go();
        System.out.println(c1.color);
        c1.color = "RED";
        System.out.println(c1.color);
        System.out.println(c1.model);
        System.out.println(c1.year);

        Car c2 = new Car();
        c2.color = "BLACK";
        c2.model = "K5";
        c2.price = 4000;
        c2.year = 2021;
        System.out.println("color " + c2.color);
        System.out.println("model " + c2.model);
        System.out.println("price " + c2.price);
        System.out.println("year " + c2.year);
        System.out.println("=============================");

        //1.객체참조변수 선언
        String s1;

        //2.객체생성
        s1 = "자바";

        //3.객체접근
        System.out.println(s1.charAt(0));
    }

}
