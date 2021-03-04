package com.kosta.day13.chapter14_Lambda;

import java.util.function.IntSupplier;

public class LAB4 {
    public static int method(int x, int y) {
        IntSupplier supplier = () -> {
//            x *= 10;                  //final이라 컴파일 에러
//            int result = x + y;       //final이라 컴파일 에러
            int z = x * 10;
            int result = z + y;
            return result;
        };
        int result = supplier.getAsInt();
        return result;
    }

    public static void main(String[] args) {
        System.out.println(method(3, 5));
    }
}
