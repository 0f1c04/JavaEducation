package com.kosta.day12;

public class AutoSaveThread extends Thread {
    public AutoSaveThread(String name) {
        setName(name);
    }

    public void save() {
        System.out.println(getName() + " 작업 내용을 저장함");
    }

    @Override
    public void run() {
        while (true) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
            save();
        }
    }
}
