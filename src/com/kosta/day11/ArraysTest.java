package com.kosta.day11;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ArraysTest {
    public static void main(String[] args) {
        method3();
    }

    private static void method3() {
        Car[] arr = new Car[5];
        arr[0] = new Car("A", 75000);
        arr[1] = new Car("D", 35000);
        arr[2] = new Car("C", 5000);
        arr[3] = new Car("B", 25000);
        arr[4] = new Car("E", 15000);

        print("before: ", arr);
        Arrays.sort(arr);
        print("after: ", arr);

        Arrays.sort(arr, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
        print("descending sort", arr);

        System.out.println(Arrays.binarySearch(arr, new Car("B", 5000)));
    }

    private static void print(String s, Car[] arr) {
        System.out.println("===========" + s + "===========");
        for(Car cc:arr) {
            System.out.println(cc);
        }
    }

    private static void method2() {
        Character[] arr = {'J', 'A', 'V', 'A'};
        System.out.println(Arrays.binarySearch(arr, 'V'));
    }

    private static void method1() {
        Character[] arr = {'J', 'A', 'V', 'A'};
        Character[] arr2 = Arrays.copyOf(arr, arr.length);
        Character[] arr3 = new Character[arr.length];

        System.out.println("arr1: " + Arrays.toString(arr));
        System.out.println("arr2: " + Arrays.toString(arr2));

        System.arraycopy(arr, 0, arr3, 0, arr.length);
        System.out.println("arr3: " + Arrays.toString(arr3));

        System.out.println(Arrays.equals(arr, arr2));
        System.out.println(Arrays.equals(arr, arr3));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr3, new CharDescending());
        System.out.println(Arrays.toString(arr3));

    }
}

class CharDescending implements Comparator<Character> {
    @Override
    public int compare(Character o1, Character o2) {
        return o2 - o1;
    }
}