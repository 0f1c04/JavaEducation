package com.kosta.day07;

public class CheckingAccount extends Account{
    //1. Field
    String cardNo;

    //2. Constructor

    public CheckingAccount(String accNo, String ownerName, int amount, String cardNo) {
        //부모가 먼저 생성 (Account)
        super(accNo, ownerName, amount);
        this.cardNo = cardNo;
    }

    public CheckingAccount() {
        super();
    }

    //3. Method
    public int pay(String cardNo, int amount) {
        if(!cardNo.equals(this.cardNo)) {
            System.out.println("카드번호가 맞지 않습니다.");
            return 0;
        }
        return withdraw(amount);
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public String toString() {
        //부모의 메소드 호출
        String s = super.toString();
        return s + " CheckingAccount{" +
                "cardNo='" + cardNo + '\'' +
                '}';
    }
}
