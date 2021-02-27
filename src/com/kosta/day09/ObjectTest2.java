package com.kosta.day09;

import java.util.Arrays;
import java.util.Date;

public class ObjectTest2 {
    public static void main(String[] args) {
        method10();
    }

    private static void method11() {
        String[] arr = {"네비게이터", "전방카메라"};
        Car car1 = new Car("그랜져", 4000);
        Car car2 = null;
        try {
            car2 = (Car) car1.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        car1.model = "벤츠";
        car1.price = 6000;
        car1.악세사리[0] = "자바책";
        System.out.println(car1 + "\n" + car2);
    }

    private static void method10() {
        //얕은 복사
        String[] arr = {"네비게이터", "전방카메라"};
        Car car = new Car("BMW", 5000, arr);
        Car car2 = null;
        try {
            car2 = (Car) car.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        car.model = "SM7";
        car.price = 1000;
        car.악세사리[0] = "블랙박스";
        System.out.println(car);
        System.out.println(car2);
    }

    private static void method9() {
        Car car1 = new Car("그랜져", 4000);
        Car car2 = null; //주소 복사
        try {
            car2 = (Car) car1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        car1.model = "벤츠";
        System.out.println(car1 + "\n" + car2);
    }

    private static void method8() {
        Car car1 = new Car("그랜져", 4000);
        Car car2 = car1; //주소 복사
        car1.model = "벤츠";

        System.out.println(car1 + "\n" + car2);
    }

    private static void method7() {
        //복사 ... 주소의 복사
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a; //복사되지않음 ... 같은 주소를 공유
        a[0] = 99;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    private static void method6() {
        //복사 ... 값의 복
        int a = 10;
        int b = a;
        a++;
        System.out.println(a + " " + b);
    }

    private static void method5() {
        //복제
        String s = new String("자바");
        String s2 = s; //복사됨
        s = new String("DB");
        System.out.println(s2);
    }

    private static void method4() {
        Date d1 = new Date();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Date d2 = new Date();
        System.out.println(d1);
        System.out.println(d2.toLocaleString());
    }

    private static void method3() {
        Car obj1 = new Car("자바", 1000);
        Car obj2 = new Car("자바", 1000);

        //Car의 toString() 재정의 안되있음 ... Object와 같음
        System.out.println(obj1);
        System.out.println(obj1.toString());
        System.out.println(obj2);
        System.out.println(obj2.toString());
    }

    private static void method2() {
        String obj1 = new String("자바");
        String obj2 = new String("자바");

        //String의 내용자체
        System.out.println(obj1);
        System.out.println(obj1.toString());
        System.out.println(obj2);
        System.out.println(obj2.toString());
    }

    private static void method1() {
        Object obj1 = new Object();
        Object obj2 = new Object();

        //class이름@hax(hashcode)
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
