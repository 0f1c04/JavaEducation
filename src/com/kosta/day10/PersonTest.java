package com.kosta.day10;

import java.util.Arrays;

public class PersonTest {

    public static void main(String[] args) {
        try {
            sample1();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static void sample3() {
        String[] phone1 = {"010-1234-1234", "051-111-1234"};
        String[] phone2 = {"010-1234-1234", "051-111-1234"};
        boolean b = Arrays.equals(phone1, phone2);
        System.out.println(b);
    }

    private static void sample1() throws CloneNotSupportedException {
        Car car = new Car("SM7", 3000);
        String[] phone = {"010-1234-1234", "051-111-1234"};
        Person p1 = new Person("홍길동", 20, car, phone);
        Person p2 = new Person("김길동", 20, new Car("그랜져", 5000), new String[]{"010-1111-2222", "02-123-1234"});
        Person p3 = new Person("홍길동", 20, car, phone);

        //복제 아님, 같은 주소를 참조
        Person p4 = p3;

        //복제 : 원본이 수정되도 복제된 객체에 영향을 미치지 않음.
        //얕은복제 : implements Cloneable, clone()메소드 추가
        //깊은복제 : clone()메소드에 코드추가 필요
        Person p5 = (Person) p3.clone();
        //깊은 복제 전 복제가 아님을 확인
        p3.getCar().setModel("수정모델");
        p3.getPhone()[0] = "0000";

        System.out.println(p3);
        System.out.println(p5);

        System.out.println(p1.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p1.equals(p3) ? "동명이인+나이같음+차도같대+번호까지!" : "다름");

    }

}
