package com.kosta.day06;

import com.kosta.day05.Person;

public class PersonTest extends Person {
    void print() {
        System.out.println(name); //name은 Person을 상속받았기 때문에 protected지만 사용가능
        //System.out.println(age); //age는 private이라 접근 불가
        //System.out.println(score); //score는 default이므로 접근 불가
    }

    public static void main(String[] args) {
        Person p = new Person();
        new PersonTest().print();
    }
}
