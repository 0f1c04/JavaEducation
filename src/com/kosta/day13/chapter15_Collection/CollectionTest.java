package com.kosta.day13.chapter15_Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionTest {
    public static void main(String[] args) {
        method4();
    }

    private static void method4() { //Vector
        List<String> data = new Vector<>();
        data.add("H");
        data.add("E");
        data.add("L");
        data.add("L");
        data.add("O");

        for (String s : data) {
            System.out.println(s);
        }
    }

    private static void method3() { //LinkedList
        List<String> data = new LinkedList<>();
        data.add("H");
        data.add("E");
        data.add("L");
        data.add("L");
        data.add("O");

        for (String s : data) {
            System.out.println(s);
        }
    }

    private static void method2() { //ArrayList 제네릭 사용
        ArrayList<String> data = new ArrayList<>();
        data.add(0, "hello");
        data.add(1, "Hello");
        data.add("hello");
        data.add("hello");
        data.add("hello");
        System.out.println(data.size() + "개");
        data.remove(1);
        System.out.println(data.size() + "개");

        for (String s : data) {
            System.out.println(s);
        }
    }

    private static void method1() {
        //List interface: 순서있음, 중복허용
        //구현 class: ArrayList, LinkedList, Vector
        ArrayList data = new ArrayList();

        //Auto Boxing
        data.add(100);
        data.add("java");
        data.add(true);
        data.add(3.14);
        data.add(2, "Hello");

        for (Object s : data) {
            System.out.println(s);
        }
    }
}
