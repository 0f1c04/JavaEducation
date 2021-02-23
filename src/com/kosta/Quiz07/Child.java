package com.kosta.Quiz07;
//6.
public class Child extends Parent{
    private String name;

    public Child() {
        this("홍길동");
        System.out.println("Child() call");
    }

    public Child(String name) {
        super(); //Object
        this.name = name;
        System.out.println("Child(String name) call");
    }
}
