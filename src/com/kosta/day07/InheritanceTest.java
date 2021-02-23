package com.kosta.day07;

class Parent {
    int a = 10;

    Parent(int i) {
        System.out.println("Parent's arg1 Constructor");
    }

    void method1() {
        System.out.println("Parent's method1");
    }
}

class Child extends Parent {
    int b = 20;
    String a = "자바"; //재정의(덮어쓰기)

    Child(String s) {
        //super(); //default
        super(11); //명시적호출
        System.out.println("Child's arg1 Constructor " + s);
    }

    // 추가 메소드
    void method2() {
        System.out.println("Child's method2");
    }

    //Override: 재정의, 덮어쓰기
    void method1() {
        super.method1();
        System.out.println("Child's override method1");
    }
}

public class InheritanceTest {
    public static void main(String[] args) {
        Child child = new Child("child");
        System.out.println(child.a + child.b);
        child.method1();
        child.method2();
    }
}
