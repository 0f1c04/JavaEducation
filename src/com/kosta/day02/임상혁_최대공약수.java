package com.kosta.day02;

public class 임상혁_최대공약수 {
    public static void main(String[] args) {
        gcd(2, 5);
        gcd(5, 15);
        gcd(250, 30);
    }

    private static void gcd(int a, int b) {
        int result = 1;
        while (result > 0) {
            result = a % b;
            a = b;
            b = result;
        }
        System.out.println(a);
    }
}
