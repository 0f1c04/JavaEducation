package com.kosta.day05;

class Singleton {
    static Singleton singleton; //static 지정, 싱글톤 선언(초기화: null이므로 getInstance에서 생성)
    private Singleton() { //싱글톤 선언방법: 접근제한자를 private으로 지정
        System.out.println("기본생성자");
    }
    static Singleton getInstance() { //static 지정
        if(singleton == null) singleton = new Singleton(); //만약 instance가 선언이 되지 않았다면 새로 선언
        return singleton; //싱글톤 반환
    }
}

public class SingletonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
}
