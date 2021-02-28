package com.kosta.day07;

/**
 * final class: 상속 불가
 * final field: 수정 불가
 * final method: 자식클래스가 재정의할 수 없는 메소드 (Override 불가능)
 */

public class Account extends Object {
    //Field
    private String accNo;
    private String ownerName;
    private int balance;

    //default 생서자는 제공된다.
    public Account() {
    }

    //생성자 추가
    public Account(String accNo, String ownerName, int balance) {
        super(); //부모가 먼저 생성: Object
        this.accNo = accNo;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    //Method
    public void deposit(int amount) {
        balance += amount;
        System.out.println(amount + " 입금되었습니다.");
    }

    protected int withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액이 부족합니다.");
            return 0;
        }
        balance -= amount;
        System.out.println(amount + " 출금되었습니다.");
        return amount;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        //재정의 로직
        return " Account{" +
                "accNo='" + accNo + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
