package com.kosta.day06.inherit;

public class InheritanceTest {
    public static void main(String[] args) {
        method2();
    }

    private static void method2() { //Person & Student class test method
        Person person = new Person("홍길동", 20, "010-1234-5678");
        System.out.println(person);
        person.exercise();
        person.eat();

        Student student = new Student("김수", 20, "010-4567-9875", 18014023, "운동");
        System.out.println(student);
        student.exercise();
        student.eat();
        student.study();
        student.doExam();
    }

    private static void method1() { //Parent & Child class test method
        Child c = new Child();

        System.out.println(c.a);
        System.out.println(c.b);
        c.method1();
        System.out.println("---");

        c.parentPrint();
    }
}
