package com.kosta.day12;

public class WriterThread implements Runnable {
    MailBox mailBox;
    String[] messages;
    String myName = "WriterThread";
    public WriterThread(MailBox mailBox, String[] messages) {
        this.mailBox = mailBox;
        this.messages = messages;
        Thread.currentThread().setName(myName);
    }


    @Override
    public void run() {
        for(String s:messages) {
            mailBox.setMessage(s);
            System.out.println(myName + "-->" + s);
            System.out.println("=================");
        }
    }
}
