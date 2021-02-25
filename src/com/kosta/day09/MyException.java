package com.kosta.day09;

public class MyException extends Exception {
    private static final long serialVersionUID = 1L;

    String message2;

    public MyException(String message) {
        super(message);
        System.out.println("나의 Exception 생성자");
        this.message2 = message;
    }

    public void print() {
        System.out.println("예외발생: " + message2);
    }
}
