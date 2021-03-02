package com.kosta.day11;

//다른 class를 상속받고 있으면 Thread상속 불가능 대신 Runnable 인터페이스 사용
//run method를 구현해야 multi thread로 사용 가능
public class AlphabetThread2 extends Object implements Runnable{
    @Override
    public void run() {
        System.out.println("이름: " + Thread.currentThread().getName());
        for(char c = 'a'; c <= 'z'; c++) {
            System.out.println(Thread.currentThread().getName() + "> " + c);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
