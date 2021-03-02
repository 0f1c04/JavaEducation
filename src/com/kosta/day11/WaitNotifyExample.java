package com.kosta.day11;

public class WaitNotifyExample {
    public static void main(String[] args) {
        DataBox dataBox = new DataBox();
        String[] message = {"HELLO", "BYE", "GOODNIGHT"};

        ProducerThread p = new ProducerThread(dataBox, message);
        ConsumerThread c = new ConsumerThread(dataBox, message.length);

        p.start();
        c.start();
    }
}
