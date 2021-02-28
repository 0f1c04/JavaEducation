package com.kosta.day05;

//접근제한자 실습

public class Student {
    //접근권한(범위): public, protected, default, private
    public String name;
    protected int[] scores;
    String major;
    private String studentNum;

    //활용방법: static, final
    public static String school;
    public final int grade = 4;
    //상수
    public static final String TEACHER = "배대장 교수님";

    //생성자의 접근권한
    Student() {
    }

    public Student(String name) {
    }

    protected Student(String name, String major) {
    }

    private Student(int[] score) {
    }

    //메소드의 접근권한
    public void study() {
    }

    protected void study2() {
    }

    void study3() {
    }

    private void study4() {
    }

    //메소드의 활용방법
    //1.static: class method
    public static void study5() {
    } //class method

    //2.final: 자식클래스가 부모클래스를 재정의 불가
    public final void study6() {
    } //자식클래스가 변경못하게
    //3.abstract(추상): 정의는 있고, 구현은 없음 (구현은 자식클래스가 함)
    //4.synchronized: lock 걸기 ... 추후 멀티쓰레드 할때 활용
}
