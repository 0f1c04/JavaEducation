package com.kosta.day11;

public class JoinExample {
    public static void main(String[] args) {
        SumThread t = new SumThread();
        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("1~100까지 합계: " + t.getSum());
    }
}
