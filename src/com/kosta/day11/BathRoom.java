package com.kosta.day11;

public class BathRoom {
    public void use(String name) {
        synchronized(this) {
            System.out.println("==========입장==========");
            System.out.println(name + " 입장합니다.");
            System.out.println(name + " 사용합니다.");
            System.out.println(name + " 퇴장합니다.");
        }
    }
}
