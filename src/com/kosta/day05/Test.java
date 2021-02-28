package com.kosta.day05;

public class Test {
    public static void main(String[] args) {
        method2();
    }

    private static void method2() {
        Book[] booklist = new Book[5];
        booklist[0] = new Book("java", 25000);
        booklist[1] = new Book("c", 20000);
        booklist[2] = new Book("c++", 15000);
        booklist[3] = new Book("SQL", 10000);
        booklist[4] = new Book("html", 22000);

        printBookInfo(booklist);
    }

    static void printBookInfo(Book[] booklist2) {
        booklist2[0].setTitle("자바");
        for (Book b : booklist2) {
            System.out.println(b.getTitle());
        }
    }

    private static void method1() {
        String title1 = "부장";
        String title2 = "부장";

        System.out.println(System.identityHashCode(title1) + "\n" + System.identityHashCode(title2));
        System.out.println(title1 == title2);
        System.out.println(title1.equals(title2));

        title1 += "님";
        title2 += "님";
        System.out.println(System.identityHashCode(title1) + "\n" + System.identityHashCode(title2));

        String title3 = "부장";
        String title4 = "부장";
        System.out.println(System.identityHashCode(title3) + "\n" + System.identityHashCode(title4));
    }
}
