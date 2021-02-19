package com.kosta.day05;

class Calculator {
    //1.멤버변수(field): non-static(instance 변수), static(class 변수)
    static double pi = 3.14;
    String color;

    //2.생성자

    //3.메소드: non-static(instance 메소드), static(class 메소드)
    int plus(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }

    //4.instance block, static block
    {
        System.out.println("instance block ... 객체 생성(new)시 자동실행");
    }

    {
        System.out.println("instance block ... 객체 생성(new)시 자동실행2");
    }

    static {
        System.out.println("static block1");
    }

    static {
        System.out.println("static block2");
        System.out.println(pi);
        //System.out.println(color); //불가능 instance 필드
        minus(10, 20);
        //plus(10, 20); //불가능 instance 메소드
        //this.pi = 3.3; //불가능 instance this
    }
    //5.inner class

}

public class StaticTest {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        Calculator cal2 = new Calculator();

        Calculator.pi = 3.141592;
        cal1.color = "red";
        cal2.color = "blue";

        //System.out.println(cal1.pi);       //바람직한 사용 x
        //System.out.println(cal2.pi);       //바람직한 사용 x
        System.out.println(Calculator.pi); //바람직한 사용 o

        System.out.println(cal1.color);
        System.out.println(cal2.color);
        System.out.println("+++++++++++++++++++++++");

        System.out.println("instance method: " + cal1.plus(10, 20));
        //System.out.println("static method: " + cal1.minus(10,20));      //바람직한 사용x
        System.out.println("static method: " + Calculator.minus(10, 20));//바람직한 사용o

    }
}
