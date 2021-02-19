package com.kosta.day06;

import com.kosta.day05.Student;

public class StudentAccessModifierTest2 {
    public static void main(String[] args) {
        //Student s1 = new Student(); //defualt 생성자의 접근제어자가 default라 접근못함
        Student s2 = new Student("배대장");
        //Student s3 = new Student("임쫄병", "정보보호학"); //protected라 접근 ㄴㄴ

        System.out.println(s2.name);
        //System.out.println(s2.scores); //protected라 접근 ㄴㄴ
        //System.out.println(s2.major); //default라 접근 ㄴ
        //System.out.println(s2.studentNum); //protected라서 접근 안됨

        System.out.println(Student.school);
        System.out.println(Student.TEACHER);
        //System.out.println(Student.grade); //main이 static이라 안됨

        s2.study();
        //s2.study2(); //protected라 접근 ㄴㄴ
        //s2.study3(); //default라 접근 ㄴㄴ
        //s2.study4(); //protected라 안됨

        Student.study5();

    }
}
