package com.kosta.day07;

public class JavaBook extends Book{

    public JavaBook(String title, int price) {
        super(title, price);
    }

    @Override
    void printTableOfContents() { //목차출력
        System.out.println("자바책의 목차입니다.");
    }

    @Override
    void printExample() { //예제출력
        System.out.println("자바책의 예제입니다.");
    }
}
