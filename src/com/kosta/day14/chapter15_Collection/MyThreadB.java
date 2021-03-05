package com.kosta.day14.chapter15_Collection;

import java.util.List;

public class MyThreadB extends Thread {
    List<String> list;

    public MyThreadB(String name, List<String> list) {
        super(name);
        this.list = list;
    }

    @Override
    public void run() {
        for(int i=0; true; i++) {
            list.add(i + "추가");
        }
    }
}
