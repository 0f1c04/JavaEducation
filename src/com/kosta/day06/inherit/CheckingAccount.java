package com.kosta.day06.inherit;

public class CheckingAccount extends Account {
    //    String accNo;
//    String ownerName;
//    int balance;
    String cardNo;

    public CheckingAccount(String accNo, String ownerName, int balance, String cardNo) {
        //1)부모의 default생성자를 정의한다.
        //super();
        //2)명시적으로 부모의 생성자를 호출한다.
        super(accNo, ownerName, balance);

        this.cardNo = cardNo;
    }

//    public void deposit(int amount) {
//        balance += amount;
//    }
//
//    public int withdraw(int amount) {
//        if(amount > balance) {
//            System.out.println("잔액부족");
//            return 0;
//        }
//        balance -= amount;
//        return amount;
//    }

    public int pay(String cardNo, int amount) {
        if (this.cardNo.equals(cardNo)) {
            return withdraw(amount);
        } else {
            System.out.println("카드번호 오류");
            return 0;
        }
    }
}
