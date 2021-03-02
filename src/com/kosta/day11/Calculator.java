package com.kosta.day11;

public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    //synchronized 동기화: 하나의 스레드가 점유하는동안 다른 thread 접근불가
    public synchronized void setMemory(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "==>" + this.memory);
    }
}
