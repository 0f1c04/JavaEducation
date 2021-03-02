package com.kosta.day11;

public class User2 extends Thread{
    private Calculator cal;

    public User2(String name, Calculator cal) {
        setName(name); //스레드 이름 바꾸기
        this.cal = cal;
    }

    @Override
    public void run() {
        cal.setMemory(50);
    }
}
