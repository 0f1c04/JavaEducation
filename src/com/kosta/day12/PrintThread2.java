package com.kosta.day12;

public class PrintThread2 extends Thread {
    public PrintThread2() {
        setName(this.getClass().getSimpleName() + " Thread");
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println(getName() + " 실행 중");
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            System.out.println("다른 스레드에서 인터럽트 발생");
        }
        System.out.println(getName() + " 자원 정리");
        System.out.println(getName() + " 실행 종료");
    }
}

