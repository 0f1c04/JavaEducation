package com.kosta.day10;

public class ObjectTest {
    public static void main(String[] args) {
        sample();
    }

    private static void sample() {
        Car car1 = new Car("람보르기니", 55000);
        Car car2 = new Car("벤틀리", 50000);
        System.out.println(car1);

        car1 = null;
        System.out.println(car1);

    }
}
