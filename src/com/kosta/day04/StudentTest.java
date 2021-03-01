package com.kosta.day04;

public class StudentTest {

    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        Student lim = new Student();
        lim.printStudent();

        Student bae = new Student("배대장", "정보보호", "18014016", 23);
        bae.printStudent();

        Student kim = new Student("김갑수", "영문과");
        kim.printStudent();

        Student park = new Student("박을용", 27);
        park.printStudent();
    }

}
