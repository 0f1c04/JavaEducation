package com.kosta.day08.innerclass;

public class Test {
    public static void main(String[] args) {
        Outer o = new Outer();

        //Outer.Inner i = o.new Inner();
        Outer.Inner i = new Outer().new Inner();
        //오답 Outer.Inner i = Outer.ner Inner();

        int n = 10;
        i.setX(n);
        o.setY(i);

        i.setX(100);
        o.getY().setX(100);

        System.out.println(o.getY().getX());
    }
}
