package com.kosta.day01;

public class VariableTest2 {
    // 1. 멤버변수 (자동 초기화)
    static int speed;
    // 2. 메서드

    // 3. static block

    // 4. instance block

    // 5. inner class

    public static void main(String[] args) {
        int speed2; // 지역변수는 반드시 초기화해야한다.

        System.out.println("a");

        // speed = speed + 1;
        // speed += 1;
        speed++; // 1증가

        speed2 = 100;

        System.out.println(speed);
        System.out.println(speed2);
    }
}
