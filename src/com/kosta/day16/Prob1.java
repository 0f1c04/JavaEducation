package com.kosta.day16;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prob1 {
    public static void main(String[] args) {
        String[] array = {"황남기85점", "조성호89점", "한인성88점", "독고정진77점"};
        printMaxScore(array);
    }

    private static void printMaxScore(String[] array) {
        Pattern pattern = Pattern.compile("([가-힣]{3,4})(\\d{2,3})([가-힣])");
        String[] name = new String[array.length];
        Integer[] score = new Integer[array.length];
        int max = 0, maxName = 0;

        for (int i = 0; i < array.length; i++) {
            Matcher matcher = pattern.matcher(array[i]);
            if (matcher.matches()) {
                name[i] = matcher.group(1);
                score[i] = Integer.parseInt(matcher.group(2));
            }
            if (max < score[i]) {
                max = score[i];
                maxName = i;
            }
        }
        System.out.println("최고점수는 " + name[maxName] + "님 " + max + "점입니다.");
    }
}
