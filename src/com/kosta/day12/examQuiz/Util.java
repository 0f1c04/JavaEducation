package com.kosta.day12.examQuiz;

public class Util {
    public static <K,V extends Pair> Integer getValue(Pair<String, Integer> pair, String key) {
        if(pair.getKey().equals(key)) return pair.getValue();
        else return null;
    }
}

