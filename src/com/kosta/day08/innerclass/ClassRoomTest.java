package com.kosta.day08.innerclass;

public class ClassRoomTest {
    public static void main(String[] args) {
        //method1();
        //method2();
        method3();
    }

    private static void method3() {
        //3. local inner class 연습
        ClassRoom cc = new ClassRoom();
        cc.test("가산", "구디");
    }

    private static void method2() {
        //2. static inner class 연습
        System.out.println(ClassRoom.Chair.title6);

        ClassRoom.Chair cc = new ClassRoom.Chair();
        System.out.println(cc.title5);
    }

    private static void method1() {
        //1. instance inner class 연습
        ClassRoom.Desk desk = new ClassRoom().new Desk();
        System.out.println(desk.title3);
    }
}
