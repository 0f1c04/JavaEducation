package com.kosta.day13.chapter14_Lambda;

//interface 구현 class 만들기
class MyRunnable extends Object implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

@FunctionalInterface //람다표현식으로 사용 가능한지 컴파일단계에서 체크하는 어노테이션
interface MyInterface {
    //public abstract 생략가능
    void myFunction();
}
class MyInterfaceImplClass implements MyInterface {
    @Override
    public void myFunction() {
        System.out.println("인터페이스 구현 클래스");
    }
}

public class LambdaExample {
    public static void main(String[] args) {
        method6();
    }

    private static void method6() {
        //람다식
        MyInterface a = () -> System.out.println("람다식");
        a.myFunction();
    }

    private static void method5() {
        //익명클래스 만들기
        (new MyInterface() {
            @Override
            public void myFunction() {
                System.out.println("익명클래스");
            }
        }).myFunction();
    }

    private static void method4() {
        MyInterface a = new MyInterfaceImplClass();
        a.myFunction();
    }

    private static void method3() {
        //Lambda 표현식
        Runnable a = () -> {
            for(int i = 0; i <= 15; i++) {
                System.out.println(i);
            }
        };
        Thread t = new Thread(a);
        t.start();
        System.out.println("method3 END");
    }

    private static void method2() {
        //익명 class 사용
        Runnable a = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i <= 15; i++) {
                    System.out.println(i);
                }
            }
        };
        Thread t = new Thread(a);
        t.start();
        System.out.println("method2 END");
    }

    private static void method1() {
        MyRunnable a = new MyRunnable();
        Thread t = new Thread(a);
        t.start();
        System.out.println("method1 END");
    }
}
