package com.kosta.day10;

import java.util.Comparator;

public class BookDescendingComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        //제목 descending 가격 ascending
        int result = o2.getTitle().compareTo(o1.getTitle());
        if (result == 0) {
            return o1.getPrice() - o2.getPrice();
        }
        return result;
    }

}
