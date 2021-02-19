package com.kosta.day05;

public class Person {
    //final: 1번만 할당가능, 수정불가
    final String nation = "Korea"; // 1)선언시 초기화
    final String ssn;
    String name;
    int age;

    //상수
    static final String COUNTRY = "대한민국";

    public Person() {
        this.ssn = null;
    }

    public Person(String ssn, String name, int age) {
        this.ssn = ssn; // 2)생성시 초기화
        this.name = name;
        this.age = age;
    }

    void test() {
        name = "이름수정";
        age = 20;
        //nation = "America"; //불가 final이기 때문
        //ssn = "1234";       //불가 final이기 때문
        //COUNTRY = "미국";    //불가 final static
    }

    void test2() {
        //Integer.MAX_VALUE = 100;
        System.out.println(Integer.MAX_VALUE); //이것도 상수
        System.out.println(Integer.class);
        System.out.println(Integer.bitCount(10));
    }

    public static void main(String[] args) {
        new Person().test2();

        String s = new String("자바프로그램").substring(0, 2);
        System.out.println(s);
    }
}
