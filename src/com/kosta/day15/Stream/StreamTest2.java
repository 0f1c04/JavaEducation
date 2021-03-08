package com.kosta.day15.Stream;

import com.kosta.day15.Student;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest2 {
    static Student[] arr = {
            new Student("홍길동", 20),
            new Student("임길동", 110),
            new Student("배길동", 100),
            new Student("김길동", 80),
    };
    static List<Student> alist = Arrays.asList(arr);

    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        Stream<Student> st = alist.stream();
        ToIntFunction<Student> f2 = aa -> aa.getScore();
        IntStream is = st.mapToInt(f2);
        OptionalDouble od = is.average();
        System.out.println(od.getAsDouble());

        Stream<Student> st2 = alist.stream();
        double result = st2.mapToInt(Student::getScore)
                .average()
                .getAsDouble();
        System.out.println(result);
    }
}
