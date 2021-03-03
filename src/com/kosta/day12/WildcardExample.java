package com.kosta.day12;

import java.util.Arrays;

public class WildcardExample {
    public static void main(String[] args) {
        Course<Person> persons = makePerson();
        Course<Worker> workers = makeWorker();
        Course<Student> students = makeStudent();
        Course<HighStudent> highStudents = makeHighStudent();

        registerCourse(persons);
        registerCourse(workers);
        registerCourse(students);
        registerCourse(highStudents);

        //registerCourseStudent(persons); x
        //registerCourseStudent(workers); x
        registerCourseStudent(students);
        registerCourseStudent(highStudents);

        registerCourseWorker(persons);
        registerCourseWorker(workers);
        //registerCourseWorker(students);   x
        //registerCourseWorker(highStudents);   x
    }

    public static void registerCourse(Course<?> cc) {
        System.out.println("==========" + cc.getName() + "==========");
        String s = Arrays.toString(cc.getStudents());
        System.out.println(s);
    }

    public static void registerCourseStudent(Course<? extends Student> cc) {
        System.out.println("==========" + cc.getName() + "==========");
        String s = Arrays.toString(cc.getStudents());
        System.out.println(s);
    }

    public static void registerCourseWorker(Course<? super Worker> cc) {
        System.out.println("==========" + cc.getName() + "==========");
        String s = Arrays.toString(cc.getStudents());
        System.out.println(s);
    }

    private static void print(Object[] ps) {
        for(Object p:ps) {
            System.out.println(p);;
        }
    }

    private static Course<HighStudent> makeHighStudent() {
        Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정", 5);
        highStudentCourse.add(new HighStudent("고등학생"));

//        Object[] ps = highStudentCourse.getStudents();
//        print(ps);
        return highStudentCourse;
    }

    private static Course<Student> makeStudent() {
        Course<Student> studentCourse = new Course<Student>("학생과정", 5);
        studentCourse.add(new Student("학생"));
        studentCourse.add(new HighStudent("고등학생"));

//        Object[] ps = studentCourse.getStudents();
//        print(ps);
        return studentCourse;
    }

    private static Course<Worker> makeWorker() {
        Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
        workerCourse.add(new Worker("직장인"));

//        Object[] ps = workerCourse.getStudents();
//        print(ps);
        return workerCourse;
    }

    private static Course<Person> makePerson() {
        Course<Person> personCourse = new Course<Person>("일반인과정", 5);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new HighStudent("고등학생"));

//        Object[] ps = personCourse.getStudents();
//        print(ps);
        return personCourse;
    }
}
