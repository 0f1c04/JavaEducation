package com.kosta.day08;

public interface RemoteControl {
    //1. 상수
    int MAX_VALUE = 10;    //public static final 생략가능
    int MIN_VALUE = 0;

    //2. 추상 메소드
    void turnOn();             //public abstract 생략가능

    void turnOff();

    void setVolume(int volume);

    //3. 디폴트 메소드(default method: 구현 class들이 공통적으로 사용하는 기능 구현
    default void setMute(boolean mute) { //public 생략가능
        if (mute) {
            System.out.println("무음 처리합니다.");
        } else {
            System.out.println("무음 해제합니다.");
        }
    }

    //4. 정적 메소드(static method: interface의 메소드)
    static void changeBattery() {        //public 생략가능
        System.out.println("건전지를 교환합니다.");
    }
}
