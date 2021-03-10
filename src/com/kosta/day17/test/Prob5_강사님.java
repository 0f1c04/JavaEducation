package com.kosta.day17.test;

public class Prob5_강사님 {
    public static void main(String[] args) {
        int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
        int[] counter = new int[4];

        for (int i = 0; i < answer.length; i++)
            counter[answer[i]-1]++;

        for (int i = 0; i < counter.length; i++)
            System.out.println((i + 1) + "의 개수는 " + counter[i] + "개 입니다.");

    }
}
