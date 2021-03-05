package com.kosta.day14.chapter15_Collection;

import java.util.List;

public class MyThreadA extends Thread {
    List<String> list;

    public MyThreadA(String name, List<String> list) {
        super(name);
        this.list = list;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (list) {
                for(String s : list) {
                    System.out.println(s + "읽기");
                }
            }
        }
    }
}
