package com.kosta.day11;

public class ProducerThread extends Thread {
    DataBox dataBox;
    String[] message;

    public ProducerThread(DataBox dataBox, String[] message) {
        this.message = message;
        this.dataBox = dataBox;
    }

    @Override
    public void run() {
        for(int i = 0; i < message.length; i++) {
            dataBox.setData(message[i]);
        }
    }
}
