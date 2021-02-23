package com.kosta.Quiz07;
//8.
class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends B {}
class F extends C {}

public class ABCDEF {
    public static void main(String[] args) {
        B b1 = new B();
        //B b2 = (B)new A();
        B b3 = new D();
        B b4 = new E();

        method(new B());
        //method((B)new A());
        method(new D());
        method(new E());
    }

    private static void method(B b) { }
}
