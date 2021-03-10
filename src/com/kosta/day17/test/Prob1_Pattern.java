package com.kosta.day17.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prob1_Pattern {
    public static void main(String[] args) {
        String[] array = {"활남기85점", "조성호89점", "한인성88점", "독고정진77점"};
        printMaxScore(array);
    }

    private static void printMaxScore(String[] array) {
        int maxScore = 0;
        String maxName = "";
        String regExp = "([가-힣]{3,4})([0-9]{1,3})[가-힣]";
        Pattern p = Pattern.compile(regExp);

        for(String s:array) {
            Matcher m = p.matcher(s);
            if(!m.find()) continue;
            String name = m.group(1);
            int score = Integer.parseInt(m.group(2));
            if(maxScore < score) {
                maxScore = score;
                maxName = name;
            }
        }
        System.out.println("최고점수는 " + maxName + "님 " + maxScore + "점 입니다.");
    }
}
