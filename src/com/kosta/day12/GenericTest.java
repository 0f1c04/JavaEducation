package com.kosta.day12;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        method8();
    }

    private static void method8() {
        System.out.println(Util.compare2(new TV(), new TV()));
        System.out.println(Util.compare2(new TV(), new NoteBook()));
        //System.out.println(Util.compare2(new TV(), new Coffee())); //Coffee는 Machine을 상속받지 못했기 때문에 제네릭 사용 불가
    }

    private static void method7() {
        System.out.println(Util.compare(10, 20));
        System.out.println(Util.compare(4.5, 3));
    }

    private static void method6() {
        Pair<String, String> p1 = new Pair<>();
        p1.setKey("이름");
        p1.setValue("사과");

        Pair<String, String> p2 = new Pair<>();
        p2.setKey("이름");
        p2.setValue("오렌지");
        System.out.println(Util.compare(p1, p2));

        Pair<String, Integer> p3 = new Pair<>();
        p3.setKey("한라봉");
        p3.setValue(1000);

        Pair<String, Integer> p4 = new Pair<>();
        p4.setKey("한라봉");
        p4.setValue(2000);
        System.out.println(Util.compare(p3, p4));
    }

    private static void method5() {
        Box<Integer> a = Util.boxing(100);
        Box<Integer> b = Util.<Integer>boxing(100);

        Box<String> c = Util.boxing("Hello");
        Box<String> d = Util.<String>boxing("Hello");

        Box<TV> e = Util.boxing(new TV());
        Box<TV> f = Util.<TV>boxing(new TV());

        System.out.println(a.getObj());
        System.out.println(b.getObj());
        System.out.println(c.getObj());
        System.out.println(d.getObj());
        System.out.println(e.getObj());
        System.out.println(f.getObj());
    }

    private static void method4() {
        Product<TV, String> p1 = new Product<>(new TV(), "삼성", 300);
        System.out.println(p1);

        Product<NoteBook, String> p2 = new Product<>(new NoteBook(), "애플", 350);
        System.out.println(p2);

        Product<Coffee, Integer> p3 = new Product<>(new Coffee(), 1234, 1);
        System.out.println(p3);
    }

    private static void method3() {
        Box<Integer> b = new Box<Integer>();
        b.setObj(100);
        int i = b.getObj();
        System.out.println(i);

        Box<String> b2 = new Box<String>();
        b2.setObj("Hello");
        String s = b2.getObj();
        System.out.println(s);
    }

    private static void method2() {
        Box b = new Box();

        b.setObj(100);
        int i = (int)b.getObj(); //원래 Integer인데 Auto boxing으로 변경됨
        System.out.println(i);

        b.setObj("Hello");
        String s = (String)b.getObj();
        System.out.println(s);
    }

    private static void method1() {
        //배열 ... 같은 타입, 여러개의 방을 만든다. 개수는 곶ㅇ
        String[] arr = new String[10];

        //Collection: List, Set, Map
        //타입 상관 x, 개수가 가변적
        List<String> list = new ArrayList<String>(2);
        list.add("java");

        String s = list.get(0);
    }
}
