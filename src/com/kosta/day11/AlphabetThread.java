package com.kosta.day11;

//다른 class를 상속받지 있지 않아서 Thread상속가능
//run method를 구현해야 multi thread로 사용 가능
public class AlphabetThread extends Thread{
    @Override
    public void run() {
        for(char c = 'A'; c <= 'Z'; c++) {
            System.out.println(getName() + ">" + c);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
