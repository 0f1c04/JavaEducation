package com.kosta.day04;

public class Coffee {
    //instance 변수: object마다 존재 static이 안붙어있음
    String name;
    int price;
    //class 변수: class마다 존재, static이 붙어있음
    static int count;

    Coffee(String name) {
        this(name, 1000);
    }

    Coffee(String name, int price) {
        this.name = name;
        this.price = price;
        count++;
    }

    void print() {
        System.out.println("주문하신 커피는 " + name + ", 가격은 " + price + "원입니다.");
    }

    //instance 메소드
    int getCount() {
        return count;
    }

    //class 메소드
    static int getCount2() {
        return count;
    }
}
