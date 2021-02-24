package com.kosta.day08;

public interface Volume {
    //1. 상수 (public static final)
    public static final String TITLE="볼륨";
    public static final String TITLE2="볼륨2";

    //2. 추상 메소드
    void volumeUp(int volLevel);
    void volumeDown(int volLevel);
    //interface에 추상메소드가 추가되면 implement 받은 class들에 영향을 미친다. 즉 추상메소드는 반드시 구현한다.

    //3. default method: 8버젼에서 추가됨, 구현한 class 재정의 가
    default void close() {
        System.out.println("Volume interface에서 구현한 close() method 모든 class에 적용");
    }

    //4. static method
    static void volumeInfo() {
        System.out.println("Volume interface의 static volumInfo method");
    }
}
