package com.kosta.day16;

public class Prob2 {
    public static void main(String[] args) {
        System.out.println(leftPad("Samsung", 10, '#'));
        System.out.println(leftPad("SDS", 5, '*'));
        System.out.println(leftPad("Multicampus", 5, '@'));
    }

    public static String leftPad(String str, int size, char fillChar) {
        try {
            if (str.length() > size) throw new IllegalSizeException("문자열의 길이보다 size가 큽니다.");
        } catch (IllegalSizeException e) {
            return "";
        }
        String strResult = " ";
        StringBuilder sbAddChar = new StringBuilder();
        for (int i = str.length(); i < size; i++) {
            sbAddChar.append(fillChar);
        }
        strResult = sbAddChar + str;
        return strResult;
    }
}

class IllegalSizeException extends Exception {
    public IllegalSizeException(String msg) {
        System.out.println(msg);
    }
}



