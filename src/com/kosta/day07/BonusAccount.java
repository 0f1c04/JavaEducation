package com.kosta.day07;

public class BonusAccount extends Account{
    double bonusPoint;

    public BonusAccount(String accNo, String ownerName, int balance, int bonusPoint) {
        super(accNo, ownerName, balance);
        this.bonusPoint = bonusPoint;
    }

    @Override
    public void deposit(int amount) {
        //부모메소드 호출
        super.deposit(amount);
        bonusPoint += amount * 0.001; //자동형변환
        //bonusPoint = (int)bonusPoint + amount * 0.001; //명시적형변환
    }

    @Override
    public String toString() {
        //고정문자열: String: 변경불가, +연산자로 연결가능
        //String s = super.toString();

        //가변문자열: StringBuilder: 변경가능, +연산자불가
        final StringBuilder sb = new StringBuilder("BonusAccount{");
        sb.append("bonusPoint=").append(bonusPoint);
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
