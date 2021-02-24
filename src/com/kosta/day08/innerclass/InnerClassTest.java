package com.kosta.day08.innerclass;

public class InnerClassTest {
    public static void main(String[] args) {
        //innerClassTest();
        //staticInnerClassTest();
        localClassTest();
    }

    private static void localClassTest() {
        OuterClass outer = new OuterClass();
        outer.test("가산역", "구디역");
    }

    private static void staticInnerClassTest() {
        //2. static inner class 사용하기
        System.out.println(OuterClass.StaticInnerClass.grade);
        OuterClass.StaticInnerClass.printGrade();

        OuterClass.StaticInnerClass staticClass = new OuterClass.StaticInnerClass();

        System.out.println(staticClass.score);
        staticClass.printScore();
    }

    private static void innerClassTest() {
        //1. instance Inner class 사용하기
        //객체참조변수선언
        OuterClass.InnerClass inner;
        //객체생성
        inner = new OuterClass().new InnerClass();
        //객체사용
        System.out.println(inner.a);
        inner.test();
    }
}
