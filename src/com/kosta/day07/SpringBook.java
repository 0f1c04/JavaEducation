package com.kosta.day07;

public class SpringBook extends Book {

    public SpringBook(String title, int price) {
        super(title, price);
    }

    @Override
    void printTableOfContents() { //목차출력
        System.out.println("스프링책의 목차입니다.");
    }

    @Override
    void printExample() { //예제출력
        System.out.println("스프링책의 예제입니다.");
    }
}
