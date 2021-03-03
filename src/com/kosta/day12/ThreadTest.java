package com.kosta.day12;

public class ThreadTest {
    public static void main(String[] args) {
        method4();
    }

    private static void method4() {
        AutoSaveThread autoSaveThread = new AutoSaveThread("AutoSaveThread");
        autoSaveThread.setDaemon(true); //데몬스레드로 설정, 메인종료시 같이 종료
        autoSaveThread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        System.out.println("main END");
    }

    private static void method3() {
        Thread t1 = new PrintThread2();
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.interrupt();
    }

    private static void method2() {
        PrintThread1 thread1 = new PrintThread1();
        thread1.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.setStop(true);
        System.out.println("main END");
    }

    private static void method1() {
        MailBox mailBox = new MailBox();
        String[] messages = {"Hello", "Bye", "Good"};

        Thread readerThread = new ReaderThread(mailBox, messages.length);
        Runnable writer = new WriterThread(mailBox, messages);
        Thread writerThread = new Thread(writer);

        readerThread.start();
        writerThread.start();
    }
}
