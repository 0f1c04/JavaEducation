package com.kosta.day04;

public class MethodTest {
    /*
     *  > java MethodTest
     *  MethodTest의 bytecode가 method영역에 load
     *  static 붙은 method, 변수가 메모리에 올라옴
     *  static 없는 method, 변수는 new 시에 올라간다.
     */
    void sum() {
        System.out.println("1.파라메터 없음, 리턴없음");
        System.out.println("=====================");

    }

    void sum(int a, int b) { //overloading
        System.out.println("2.파라메터 있음, 리턴없음");
        System.out.println(a + b);
        System.out.println("=====================");
    }

    String sum(String a, String b) { //overloading
        System.out.println("3.파라메터 있음, 리턴있음");
        return a + b;
    }

    public static void main(String[] args) {
        MethodTest aa = new MethodTest();
        aa.sum();
        aa.sum(10, 20);
        String bb = aa.sum("자", "바");
        System.out.println(bb);
    }

}
