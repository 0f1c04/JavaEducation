package com.kosta.day13.chapter14_Lambda;

import java.util.function.ToIntFunction;

public class LAB6 {
    private static Student[] students = {
            new Student("홍길동", 90, 96),
            new Student("배대장", 95, 98)
    };

    //avg() 메소드
    static double avg(ToIntFunction<Student> toIntFunction){
        int sum = 0;
        for(Student student:students) {
            sum += toIntFunction.applyAsInt(student);
        }
        return (double)sum / students.length;
    }

    public static void main(String[] args) {
        double englishAvg = avg(Student::getEnglishScore);
        System.out.println("영어 평균 점수: " + englishAvg);

        double mathAvg = avg(Student::getMathScore);
        System.out.println("수학 평균 점수: " + mathAvg);
    }
}
