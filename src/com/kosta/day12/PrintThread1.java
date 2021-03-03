package com.kosta.day12;

public class PrintThread1 extends Thread {
    private boolean stop;

    public PrintThread1() {
        setName(this.getClass().getSimpleName() + " Thread");
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        while (!stop) {
            System.out.println(getName() + "실행 중");
        }
        System.out.println(getName() + "자원 정리");
        System.out.println(getName() + "실행 종료");
    }
}
