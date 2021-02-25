package com.kosta.day09.lab;

class Dice {
    int size;
    Dice(int size) {
        this.size = size;
    }
    int play() {
        int number = (int)(Math.random() * size) + 1;
        return number;
    }
}

public class DiceGame {
    public static void main(String args[]) {
        DiceGame game = new DiceGame();

        int result1 = game.countSameEye(10);
        System.out.println("면의 개수가 8개인 주사위 2개를 던져서 같은 눈이 나온 횟수 : " + result1);

        int result2 = game.countSameEye(-10);
        System.out.println("면의 개수가 8개인 주사위 2개를 던져서 같은 눈이 나온 횟수 : " + result2);
    }

    int countSameEye(int n) {
        try {
            if (n < 0) throw new IllegalArgumentException("횟수가 음수값입니다.");
        } catch (IllegalArgumentException e) {
            e.getMessage();
        }
        //구현
        int count = 0;
        int a, b;
        Dice dice1 = new Dice(8);
        Dice dice2 = new Dice(8);

        for(int i = 0; i < n; i++) {
            a = dice1.play();
            b = dice2.play();
            if(a == b) count++;
        }

        return count;
    }
}
