package com.kosta.day15.Stream;

import com.kosta.day15.Student;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamTest1 {
    public static void main(String[] args) {
        method6();
    }

    private static void method8() {
        Student[] arr = {
                new Student("홍길동", 20),
                new Student("임길동", 110),
                new Student("배길동", 100),
                new Student("김길동", 80),
        };
        List<Student> alist = Arrays.asList(arr);
        double result = alist.stream()
                .mapToInt(Student::getScore)
                .average()
                .getAsDouble();
        System.out.println(result);
    }

    private static void method7() {
        Student[] arr = {
                new Student("홍길동", 20),
                new Student("임길동", 110),
                new Student("배길동", 100),
                new Student("김길동", 80),
        };
        List<Student> alist = Arrays.asList(arr);
        int sum = 0;
        for(Student s:alist) {
            sum += s.getScore();
        }
        System.out.println((double)sum / alist.size());
    }

    private static void myPrint(Student student) {
        System.out.println(student + ":" + Thread.currentThread().getName());
    }

    private static void method6() {
        Student[] arr = {
                new Student("홍길동", 20),
                new Student("임길동", 110),
                new Student("배길동", 100),
                new Student("김길동", 80),
        };
        List<Student> alist = Arrays.asList(arr);
        Stream<Student> st = alist.stream();
//        Consumer<Student> consumer = aa -> myPrint(aa);
        Consumer<Student> consumer = StreamTest1::myPrint;
        st.forEach(consumer);

        System.out.println("------------------------------------");
        Stream<Student> st2 = alist.parallelStream();
        st2.forEach(consumer);
    }

    private static void method5() {
        Student[] arr = {
                new Student("홍길동", 20),
                new Student("임길동", 110),
                new Student("배길동", 100),
                new Student("김길동", 80),
        };
        List<Student> alist = Arrays.asList(arr);
        Stream<Student> st = alist.stream();
        Consumer<Student> consumer = aa -> System.out.println(aa);
        st.forEach(consumer);
    }

    private static void method4() {
        Integer[] arr = {100, 50, 20, 100, 70};
        List<Integer> alist = Arrays.asList(arr);
        Stream<Integer> st = alist.stream();
        Consumer<Integer> consumer = aa -> {
            System.out.println("점수는" + aa);
        };
        st.forEach(consumer);
    }

    private static void method3() {
        String[] arr = new String[]{"홍길동", "배길동", "임길동"};
        List<String> alist = Arrays.asList(arr);
//        Stream<String> st = alist.stream();
//        st.forEach(s-> System.out.println(s));
        Consumer<String> consumer = s -> System.out.println(s);
        for(String str:alist) {
            consumer.accept(str);
        }
        System.out.println("--------------------------");
        Stream<String> st = alist.stream();
        st.forEach(consumer);
    }

    private static void method2() {
        String[] arr = new String[]{"홍길동", "배길동", "임길동"};
        List<String> alist = Arrays.asList(arr);

        //반복자 확장 for문 사용
        for(String s:alist)
            System.out.println(s);
    }

    private static void method1() {
        String[] arr = new String[]{"홍길동", "배길동", "임길동"};
        List<String> alist = Arrays.asList(arr);
        List<String> alist2 = Arrays.asList(new String[]{"홍길동", "배길동", "임길동"});
        List<String> alist3 = Arrays.asList("홍길동", "배길동", "임길동");

        //반복자 직접 사용
            Iterator<String> it = alist.iterator();
            while(it.hasNext()) {
                String s = it.next();
                System.out.println(s);
        }
    }
}
