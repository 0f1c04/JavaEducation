package com.kosta.day07;

//Account 다형성연습
public class AccountTest2 {
    public static void main(String[] args) {
        //계좌 4개 만들기: 배열사용
        //Account
        //CreditLineAccount
        //BonusAccount
        //CheckingAccount

        Account[] accounts = new Account[4];
        makeAccount(accounts);
        printAccount(accounts);
        System.out.println("---------Casting Account");
        castingAccount(accounts);
    }

    private static void castingAccount(Account[] accounts) {
        for(Account arr:accounts) {
            if(arr instanceof CreditLineAccount) {
                System.out.println("=========Casting CreditLineAccount");
                //new CreditLineAccount() -> Account -> CreditLineAccount
                CreditLineAccount creditLineAccount = (CreditLineAccount) arr;
                System.out.println("마이너스한도: " + creditLineAccount.getCreditLine());
            }else if(arr instanceof BonusAccount) {
                System.out.println("=========Casting BonusAccount");
                //new BonusAccount() -> Account -> BonusAccount
                arr.deposit(1000);
                BonusAccount bonusAccount = (BonusAccount) arr;
                bonusAccount.deposit(2000);
                System.out.println(bonusAccount.bonusPoint + " 포인트");
            }else if(arr instanceof CheckingAccount) {
                System.out.println("=========Casting CheckingAccount");
                //new CheckingAccount() -> Account -> CheckingAccount
                CheckingAccount checkingAccount = (CheckingAccount)arr;
                System.out.println("카드번호: " + checkingAccount.getCardNo());
                int amount = checkingAccount.pay("0212", 100);
                System.out.println(amount);
            }
        }
    }

    private static void printAccount(Account[] accounts) {
        for(Account arr:accounts) {
            System.out.println(arr);
            System.out.println("==========================================");
        }
    }

    private static void makeAccount(Account[] accounts) {
        //자동형변환: 부모타입 = 자식객체
        accounts[0] = new Account("111", "kim", 100);
        accounts[1] = new CreditLineAccount("222", "lim", 100, 500);
        accounts[2] = new BonusAccount("333", "bae", 100, 10);
        accounts[3] = new CheckingAccount("444", "park", 100, "0212");
    }
}
