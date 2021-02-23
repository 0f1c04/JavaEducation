package com.kosta.day06.inherit;

public class Student extends Person{
    int schoolNo;
    String major;
    public Student(String name, int age, String phone, int schoolNo, String major) {
        //부모의 생성자를 명시적으로 호출
        super(name, age, phone);
        this.schoolNo = schoolNo;
        this.major = major;
    }
    void study() { System.out.println("공부한다."); }
    void doExam() { System.out.println("시험본다.");}

    @Override
    public String toString() {
        String s = super.toString();
        return s + " Student{" +
                "schoolNo=" + schoolNo +
                ", major='" + major + '\'' +
                '}';
    }
}
