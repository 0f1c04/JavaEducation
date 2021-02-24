package com.kosta.day08;

public class MyClassTest {
    public static void main(String[] args) {
        MyClass myClass1 = new MyClass(new Television());
        MyClass myClass2 = new MyClass(new Audio());
        MyClass myClass3 = new MyClass(new SmartTelevision());

        myClass1.methodA();
        myClass2.methodA();
        myClass3.methodA();

        myClass1.setRc(new SmartTelevision());
        myClass2.setRc(new SmartTelevision());
        myClass3.setRc(new SmartTelevision());

        System.out.println(myClass1);
        System.out.println(myClass2);
        System.out.println(myClass3);
    }
}
