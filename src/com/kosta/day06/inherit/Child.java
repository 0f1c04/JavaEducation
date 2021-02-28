package com.kosta.day06.inherit;

//자식이 부모를 선택
public class Child extends Parent {
    //자식이 추가한 변수
    int b = 20;

    //재정의 가능 (override, 덮어쓰기)
    String a = "Child에서 재정의된 변수";

    @Override
    void method1() {
        System.out.println("Child에서 재정의된 메소드");
    }

    //overloading (이름이 같고 매개변수가 다름)
    void method1(String s) {
        System.out.println("Child에서 재정의된 메소드");
    }

    //자식의 생성자
    Child() {
        super();
        System.out.println("자식의 생성자");
    }

    //자식이 추가한 메소드
    void parentPrint() {
        //부모에게 물려받은 변수사용
        System.out.println("a= " + a);

        //부모에게 물려받은 메소드 호출
        method1();
    }
}
