package com.kosta.day05;
/*
public: 모든패키지에서 접근가능
생략(default): 현재패키지에서만 접근가능
private: 현재 class 에서만 접근가능
 */
public class Person {
    //final: 1번만 할당가능, 수정불가
    public final String nation = "Korea"; // 1)선언시 초기화
    public final String ssn;
    public String name;
    public int age;

    //상수
    public static final String COUNTRY = "대한민국";

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
        //nation = "America"; //불가 final 이기 때문
        //ssn = "1234";       //불가 final 이기 때문
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
