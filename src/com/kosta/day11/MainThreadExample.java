package com.kosta.day11;

public class MainThreadExample {
        public static void main(String[] args) {
        //공유객체
        Calculator cal = new Calculator();

        User1 t1 = new User1("USER1", cal);
        User2 t2 = new User2("USER2", cal);

        t1.start();
        t2.start();
    }
}
