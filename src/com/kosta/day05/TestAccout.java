package com.kosta.day05;

class Account {
    private String accNo;
    private int balance;

    Account(String accNo) {
        this.accNo = accNo;
        String message = accNo + " 계좌가 개설되었습니다.";
        print(message);
    }

    void save(int amount) {
        balance += amount;
        String message = getAccNo() + " 계좌에 " + amount + "만원이 입금되었습니다.";
        print(message);
    }

    void deposit(int amount) {
        balance -= amount;
        String message = getAccNo() + " 계좌에 " + amount + "만원이 출금되었습니다.";
        print(message);
    }

    private void print(String message) {
        System.out.println(accNo + " 계좌의 " + message);
        System.out.println(getAccNo() + " 계좌의 잔고는 " + getBalance() + "만원입니다.");
    }

    int getBalance() {
        return this.balance;
    }

    String getAccNo() {
        return this.accNo;
    }
}

public class TestAccout {
    public static void main(String[] args) {
        Account a = new Account("078-3762-293");
        a.save(100000);
        a.deposit(50000);
    }
}
