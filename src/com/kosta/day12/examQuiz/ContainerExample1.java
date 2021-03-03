package com.kosta.day12.examQuiz;

public class ContainerExample1 {
    public static void main(String[] args) {
        Container1<String> container1 = new Container1<String>();
        container1.set("홍길동");
        String str = container1.get();
        System.out.println(str);

        Container1<Integer> container2 = new Container1<Integer>();
        container2.set(6);
        int value = container2.get();
        System.out.println(value);
     }
}
