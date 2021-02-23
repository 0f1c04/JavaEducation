package com.kosta.day07;

public class BookTest {
    public static void main(String[] args) {
        print(new JavaBook("이것이 자바다", 30000));
        print(new SpringBook("이것이 스프링이다", 35000));
    }

    public static void print(Book book) {
        book.printTableOfContents();
        book.printExample();
    }
}
