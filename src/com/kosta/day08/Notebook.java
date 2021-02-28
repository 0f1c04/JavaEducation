package com.kosta.day08;

public class Notebook implements Volume {
    int volLevel;

    void test() {
        System.out.println("----상수값 접근----");
        System.out.println(TITLE);
        volumeUp(100);
        volumeDown(10);
        Volume.volumeInfo();
    }

    @Override
    public void volumeUp(int volLevel) {
        this.volLevel += volLevel;
        System.out.println(getClass().getSimpleName() + ":" + this.volLevel);
    }

    @Override
    public void volumeDown(int volLevel) {
        this.volLevel -= volLevel;
        System.out.println(getClass().getSimpleName() + ":" + this.volLevel);
    }

    @Override
    public void close() {
        //default method는 구현 class에서 재정의 가능
        System.out.println("Notebook class에서 재정의한 default close() method");
    }
}
