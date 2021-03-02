package com.kosta.day11;

public class TransferThread extends Thread {
    ShareAccount shareAccount;
    public TransferThread(ShareAccount shareAccount) {
        this.shareAccount = shareAccount;
    }

    @Override
    public void run() {
        for(int i = 0; i < 12; i++) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            shareAccount.transfer();
        }
    }
}
