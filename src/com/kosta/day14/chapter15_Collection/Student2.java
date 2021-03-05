package com.kosta.day14.chapter15_Collection;

import java.util.Objects;

class Student2 {
    private String name;
    private String sex;
    private int score;

    public Student2(String name, String sex, int score) {
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getScore() {
        return score;
    }

    //중복 체크 추가 21.03.05
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return score == student2.score &&
                Objects.equals(name, student2.name) &&
                Objects.equals(sex, student2.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, score);
    }
}
