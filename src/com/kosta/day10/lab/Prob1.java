package com.kosta.day10.lab;

public class Prob1 {
    public static void main(String[] args) {
        String plainText = "everyday we have is one more than we deserve";
        String cryptoText;

        StringBuilder sb = new StringBuilder();
        for(int i=0; i < plainText.length(); i++) {
            if(plainText.charAt(i) != ' ') {
                int s = plainText.charAt(i) + 3;
                if(s > 122) {
                    s -= 122 - 97 + 1;
                }
                sb.append((char)s);
            }
            else {
                sb.append(plainText.charAt(i));
            }
        }
        cryptoText = sb.toString();

        System.out.println("암호화할 문자열 : " + plainText);
        System.out.println("암호화된 문자열 : " + cryptoText);
    }

    void method1() {
        String caesar = "everyday we have is one more than we deserve";
        System.out.println(caesar);

        StringBuffer sb = new StringBuffer();
        for(int i=0; i<caesar.length(); i++) {
            char c = caesar.charAt(i);
            int intC = (int)c;
            if(c ==' ') sb.append(c);
            else {
                if(intC >= 65 && intC <=90) {
                    intC += 3;
                    if(intC > 90) {
                        intC -= 26;
                    }
                }
                sb.append((char)intC);
            }
        }
        System.out.println(sb);
    }
}
