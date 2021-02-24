package com.kosta.day08;

interface SuperInterface {
    void method5();
}

interface A extends SuperInterface{
    void method1(); //추상 메소드
    void method2(); //추상 메소드
}
interface B extends SuperInterface{
    void method3(); //추상 메소드
    void method4(); //추상 메소드
}

class 구현클래스 implements A, B {
    @Override
    public void method1() {
        System.out.println("구현 클래스 method1");
    }

    @Override
    public void method2() {
        System.out.println("구현 클래스 method2");
    }

    @Override
    public void method3() {
        System.out.println("구현 클래스 method3");
    }

    @Override
    public void method4() {
        System.out.println("구현 클래스 method4");
    }

    @Override
    public void method5() {
        System.out.println("구현 클래스 method5");
    }
}

class 구현클래스2 implements A, B {
    @Override
    public void method1() {
        System.out.println("구현 클래스2 method1");
    }

    @Override
    public void method2() {
        System.out.println("구현 클래스2 method2");
    }

    @Override
    public void method3() {
        System.out.println("구현 클래스 method3");
    }

    @Override
    public void method4() {
        System.out.println("구현 클래스 method4");
    }

    @Override
    public void method5() {
        System.out.println("구현 클래스 method5");
    }
}

public class interfaceTest {
    public static void main(String[] args) {
        infoPrint(new 구현클래스());
        infoPrintB(new 구현클래스2());

        //익명구현객체
        infoPrint(makeAnonymousA());
        infoPrint(makeAnonymousB());
    }

    private static A makeAnonymousA() {
        return new A() {
            @Override
            public void method5() {
                System.out.println("익명구현객체 method5");
            }

            @Override
            public void method1() {
                System.out.println("익명구현객체 method1");
            }

            @Override
            public void method2() {
                System.out.println("익명구현객체 method2");
            }
        };
    }

    private static A makeAnonymousB() {
        return new A() {
            @Override
            public void method5() {
                System.out.println("익명구현객체 method5");
            }

            @Override
            public void method1() {
                System.out.println("익명구현객체 method1");
            }

            @Override
            public void method2() {
                System.out.println("익명구현객체 method2");
            }
        };
    }

    private static void infoPrint(A aa) {
        aa.method1();
        aa.method2();
        if(aa instanceof B) {
            ((B)aa).method3();
            ((B)aa).method4();
        }
        System.out.println("=======================");
    }

    private static void infoPrintB(B aa) {
        aa.method3();
        aa.method4();
        if(aa instanceof A) {
            ((A)aa).method1();
            ((A)aa).method1();
        }
        System.out.println("=======================");
    }
}
