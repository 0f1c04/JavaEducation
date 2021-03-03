package com.kosta.day12;

public class Course<T> {
    private String name;
    private T[] students;

    public Course(String name, int capacity) {
        this.name = name;
        this.students = (T[])new Object[capacity];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T[] getStudents() {
        return students;
    }

    public void add(T t) {
        //배열의 빈 곳에 학생을 한 명씩 대입
        for(int i = 0; i < students.length; i++) {
            if(students[i] == null) {
                students[i] = t;
                break;
            }
        }
    }
}
