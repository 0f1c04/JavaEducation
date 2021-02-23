package com.kosta.day07;

//마이너스 통장
public class CreditLineAccount extends Account{
    private int creditLine;

    public CreditLineAccount(String accNo, String ownerName, int balance, int creditLine) {
        //부모의 생성자를 명시적으로 호출
        super(accNo, ownerName, balance);
        //자신의 field는 직접 초기화
        this.creditLine = creditLine;
    }

    //Override 재정의: 부모의 메소드 수정 (메소드의 선언부가 같아야함: return type, method name, parameter)
    //modifier(접근제한자)는 같거나 더 넓어져야한다.
    public int withdraw(int amount) {
        int balance = getBalance();
        if(balance + creditLine < amount) {
            System.out.println("잔액이 부족합니다.");
            return 0;
        }
        setBalance(balance - amount);
        return amount;
    }

    public int getCreditLine() {
        return creditLine;
    }

    public void setCreditLine(int creditLine) {
        this.creditLine = creditLine;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CreditLineAccount{");
        sb.append("creditLine=").append(creditLine);
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
