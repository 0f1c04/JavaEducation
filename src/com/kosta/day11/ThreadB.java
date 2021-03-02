package com.kosta.day11;

public class ThreadB extends Thread {
    public boolean stop = false;
    public boolean work = true;

    @Override
    public void run() {
        while (!stop) {
            if(work) {
                System.out.println(getClass().getSimpleName() + " 작업내용");
            } else {
                yield();
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getClass().getSimpleName() + " 작업종료");
    }
}
