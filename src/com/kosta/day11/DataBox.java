package com.kosta.day11;

//여러 스레드가 공유하는 데이터 (생산자 thread, 소비자 thread)
public class DataBox {
    private String data;

    public synchronized String getData() {
        if (this.data == null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String returnValue = data;
        System.out.println("소비자 스레드가 읽은 데이터 " + returnValue);
        data = null;
        notify();
        return returnValue;
    }

    public synchronized void setData(String data) {
        if (this.data != null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.data = data;
        System.out.println("생산자가 만든 데이터 " + data);
        notify();
    }
}
