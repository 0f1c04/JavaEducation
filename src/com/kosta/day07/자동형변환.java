package com.kosta.day07;

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class 자동형변환 {
    public static void main(String[] args) {
        method6();
    }

    private static void method6() {
        Tire tire = new GumhoTire();
        //System.out.println(tire.gumho); //자식타입으로 강제형변환되어도 자식타입 멤버변수를 사용할 수 없음
        //타입에 따라 변수도 달라짐
        System.out.println(tire.a);

        //되돌아가기
        System.out.println(((GumhoTire)tire).gumho);

        printTire(new GumhoTire());
        printTire(new HankookTire());
    }

    private static void printTire(Tire tire) {
        System.out.println("---------");
        if(tire instanceof GumhoTire)
            System.out.println(((GumhoTire)tire).gumho);
        if(tire instanceof HankookTire)
            System.out.println(((HankookTire)tire).hankook);
    }

    private static void method5() {
        Tire tire = new GumhoTire();
        if(tire instanceof HankookTire) {
            HankookTire hankookTire = (HankookTire) tire;
            System.out.println(tire);
        }else if(tire instanceof GumhoTire) {
            GumhoTire gumhoTire = (GumhoTire)tire;
            System.out.println(tire);
        }
    }

    private static void method4() {
        //잘못된 코드 ... 컴파일시 오류발견 x ... 실행시 오류
        //Account account = new Account();
        //CheckingAccount checkingAccount = (CheckingAccount)account;

        //강제형변환은 본래의 객체로 casting만 가능
        Account account = new CreditLineAccount(null, null, 0, 0);
        CreditLineAccount creditLineAccount = (CreditLineAccount)account;
    }

    private static void method3() {
        //자동형변환
        Account account = new CheckingAccount();
        //강제형변환
        CheckingAccount checkingAccount = (CheckingAccount)account;

        System.out.println(checkingAccount);
    }

    private static void method2() {
        //객체의 자동형변환: 부모타입 = 자식객체
        A a = new B(); //자동
        Account account = new CheckingAccount(); //자동

        //객체의 강제형변환: 자식타입 = (자식타입)부모객체
        B b = (B)new A();
        CheckingAccount checkingAccount = (CheckingAccount)new Account(); //강제

        //기본형의 강제형변환: 작은방 = (작은방타입)큰값
        int i = 10;
        double d = 3.14;
        d = i;      //가능
        //i = d;    //불가능
        i = (int)d; //강제형변환
    }

    private static void method1() {
        A a1 = new B(); //가능
        A a2 = new C(); //가능
        A a3 = new D(); //가능
        B b1 = new D(); //가능
        C c1 = new E(); //가능
        C c2 = new E(); //가능
        A a4 = new E(); //가능
        Object obj = new E(); //가능

        //B b2 = new E(); //불가능
        //D d2 = new E(); //불가능
    }
}
