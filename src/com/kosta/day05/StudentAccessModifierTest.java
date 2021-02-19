package com.kosta.day05;

public class StudentAccessModifierTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("배대장");
        Student s3 = new Student("임쫄병", "정보보호학");

        System.out.println(s3.name);
        System.out.println(s3.scores);
        System.out.println(s3.major);
        //System.out.println(s3.studentNum); //protected라서 접근 안됨

        System.out.println(Student.school);
        System.out.println(Student.TEACHER);
        //System.out.println(Student.grade); //main이 static이라 안됨

        s3.study();
        s3.study2();
        s3.study3();
        //s3.study4(); //protected라 안됨

        Student.study5();

    }
}
