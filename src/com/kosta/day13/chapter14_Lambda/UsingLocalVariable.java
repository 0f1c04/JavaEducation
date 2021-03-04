package com.kosta.day13.chapter14_Lambda;

public class UsingLocalVariable {
    void method(int arg) { //arg는 final 특성을 가짐
        int localVar = 40; //localVar는 final 특성을 가짐

        //arg = 31;         //final 특성 떄문에 수정불가
        //localVar = 41;    //final 특성 떄문에 수정불가

        //람다식
        MyFunctionalInterface fi = () -> {
            //로컬 변수 읽기
            System.out.println("arg: " + arg);
            System.out.println("localVar: " + localVar + "\n");
        };
        fi.method();
    }
}

class UsingLocalVariableExample {
    public static void main(String[] args) {
        UsingLocalVariable ulv = new UsingLocalVariable();
        ulv.method(10);
    }
}
