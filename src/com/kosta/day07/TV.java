package com.kosta.day07;

//abstract class: 생성자 정의가능
//interface: 생성자 없음, 상수와 추상메소드, 일반메소드불가

public abstract class TV {
    //1. field(변수, 상수)
    public static final String CHANNEL5 = "SBS";

    //2. constructor

    //3. method, Abstract method
    public abstract void powerOn();

    public abstract void powerOff();
}