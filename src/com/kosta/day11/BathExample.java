package com.kosta.day11;

public class BathExample {
    public static void main(String[] args) {
        BathRoom room = new BathRoom();
        BathThread t1 = new BathThread(room, "김씨");
        BathThread t2 = new BathThread(room, "박씨");
        BathThread t3 = new BathThread(room, "배씨");
        BathThread t4 = new BathThread(room, "임씨");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
