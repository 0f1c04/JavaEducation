package com.kosta.day11;

public class MultiThreadProcessTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " 시작");

        //Multi Thread 사용
        //1. Thread를 상속받은 class 이용
        //2. Runnable interface를 구현한 class 이용
        Thread t1 = new AlphabetThread();
        Runnable r = new AlphabetThread2();
        Thread t2 = new Thread(r);
        Thread t3 = new AlphabetThread();

        t1.setName("대문자1");
        t2.setName("소문자1");
        t3.setName("대문자2");

        //시작
        t1.start();
        t2.start();
        t3.start();

        for(int i = 1; i <= 26; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " 끝");
    }
}
