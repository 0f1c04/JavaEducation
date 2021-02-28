package com.kosta.day07.interfaceexam;

//interface: 규격서
public interface TVinterface {
    //1. 상수 (변경불가)
    String CHANNEL5 = "SBS"; //public static final 생략가능
    String CHANNEL7 = "KBS";

    //2. 추상 메소드
    void powerOn(); //public abstract 생략가능

    void powerOff();

    //3. default 메소드
    //4. static 메소드
}
