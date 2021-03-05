package com.kosta.day14.chapter15_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ThreadTest {
    public static void main(String[] args) {
        //List<String> alist = new Vector<>();
        List<String> alist = Collections.synchronizedList(new ArrayList<>());

        MyThreadA t1 = new MyThreadA("A스레드", alist);
        MyThreadB t2 = new MyThreadB("B스레드", alist);
        t1.start();
        t2.start();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
