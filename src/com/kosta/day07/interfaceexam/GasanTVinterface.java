package com.kosta.day07.interfaceexam;

//interface 구현한 class
//interface내의 추상 메소드를 반드시 구현할 의무가 있음
public class GasanTVinterface implements TVinterface {
    public void print() {
        System.out.println("가산TV에 추가한 함수이다.");
    }

    @Override
    public void powerOn() {
        System.out.println(getClass().getSimpleName() + " 전원을 켠다.");
        System.out.println(CHANNEL7 + "채널을 본다.");
    }

    @Override
    public void powerOff() {
        System.out.println(getClass().getSimpleName() + " 전원을 끈다.");
    }
}
