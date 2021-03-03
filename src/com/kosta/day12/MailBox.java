package com.kosta.day12;

public class MailBox {
    String message;

    public synchronized String getMessage() {
        //System.out.println("메시지 읽음: " + message);
        if(this.message == null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String returnValue = message;
        this.message = null;
        notify(); //wait() 상태를 깨우기
        return returnValue;
    }

    public synchronized void setMessage(String message) {
        if(this.message != null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //this.message가 비어있으면 쓴다.
        this.message = message;
        notify();
        //System.out.println("메시지 변경:" + message);
    }
}
