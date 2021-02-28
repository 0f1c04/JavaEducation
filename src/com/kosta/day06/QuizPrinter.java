package com.kosta.day06;

/**
 * @author f1c04
 * Overloading
 */
public class QuizPrinter {
    public void println(int num) {
        System.out.println("integer: " + num);
    }

    public void println(boolean num) {
        System.out.println("boolean: " + num);
    }

    public void println(double num) {
        System.out.println("double: " + num);
    }

    public void println(String num) {
        System.out.println("String: " + num);
    }
}
