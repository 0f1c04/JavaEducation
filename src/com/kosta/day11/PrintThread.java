package com.kosta.day11;

public class PrintThread extends Thread {
    ShareAccount shareAccount;
    public PrintThread(ShareAccount shareAccount) {
        this.shareAccount = shareAccount;
    }

    @Override
    public void run() {
        for(int i = 0; i < 3; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(shareAccount.getTotal());
        }
    }
}
