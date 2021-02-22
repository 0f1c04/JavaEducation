package com.kosta.day05;

//Book을 이용해서 만든 업무로직
public class BookMgr {
    Book[] booklist;

    public BookMgr(Book[] b) {
        this.booklist = b;
    }

    public void printBookList() {
        System.out.println("=== 책 목록 ===");
        for (Book book : booklist) {
            System.out.println(book.getTitle());
        }
        System.out.println();
    }

    public void printTotalPrice() {
        System.out.println("=== 책 가격의 총합 ===");
        int total = 0;
        for (Book book : booklist) {
            total += book.getPrice();
        }
        System.out.println("전체 책 가격의 합: " + total);
    }
}
