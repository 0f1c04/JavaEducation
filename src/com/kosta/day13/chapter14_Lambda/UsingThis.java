package com.kosta.day13.chapter14_Lambda;

@FunctionalInterface
interface MyFunctionalInterface {
    void method();
}

public class UsingThis {
    public int outerField = 10;
    String innerStringField = "outer java";
    class Inner {
        int innerField = 20;
        String innerStringField = "inner java";

        void method() {
            MyFunctionalInterface fi = () -> {
                System.out.println("outerField: " + outerField);
                System.out.println("outerField: " + UsingThis.this.outerField);
                System.out.println("innerField: " + innerField);
                System.out.println("innerField: " + this.innerField);
                System.out.println("innerStringField: " + innerStringField);
                System.out.println("innerStringField: " + UsingThis.this.innerStringField);
                System.out.println("innerStringField: " + this.innerStringField);
            };
            fi.method();
        }
    }

    public static void main(String[] args) {
        UsingThis.Inner inner = new UsingThis().new Inner();
        inner.method();
    }
}
