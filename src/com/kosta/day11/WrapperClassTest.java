package com.kosta.day11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class WrapperClassTest {
    public static void main(String[] args) {
        method6();
    }

    private static void method6() {
        //중복없음 ... set
        Random r = new Random();
        Set<Integer> luckNum = new HashSet<>();
        while (true) {
            if(luckNum.size() == 6) break;
            int temp = r.nextInt(45) + 1;
            luckNum.add(temp);
        }
        System.out.println(luckNum);
    }

    private static void method5() {
        Random r = new Random();
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void method4() {
        Random r = new Random(1);
        System.out.println(r.nextInt(45) + 1);
    }

    private static void method3() {
        double a = Math.random();
        System.out.println(a);
        System.out.println(a*45);
        System.out.println((int)(a * 45));
        System.out.println((int)(a*45) + 1);
    }

    private static void method1() {
        byte b = 10;
        short s = 10;
        char c = 'A';
        int i = 10;
        long l = 10L;
        float f = 3.14f;
        double d = 3.14;
        boolean bo1 = true;


        //Auto Boxing
        Byte b2 = 10; //new Byte(10)
        Short s2 = 10;
        Character c2 = 'A';
        Integer i2 = 10;
        Long l2 = 10L;
        Float f2 = 3.14f;
        Double d2 = 3.14;
        Boolean bo2 = true;

        //Unboxing
        //System.out.println(b2.byteValue() + 20); //이렇게 써야하는데 생략해도됨
        System.out.println(b2 + 20);
        System.out.println(s2 + 20);
        System.out.println(c2 + 20);
        System.out.println(i2 + 20);
        System.out.println(l2 + 20);
        System.out.println(f2 + 20);
        System.out.println(d2 + 20);
        System.out.println(bo2.booleanValue()); //이렇게 써야하는데 생략해도됨
    }
}
