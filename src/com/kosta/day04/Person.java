package com.kosta.day04;

public class Person {
    private static int numberOfPersons;
    int age;
    String name;

    Person() {
        this(12, "Anonymous");
    }

    Person(int age, String name) {
        this.age = age;
        this.name = name;
        numberOfPersons++;
    }

    void selfIntroduce() {
        System.out.println("내 이름은 " + name + "이며, 나이는 " + age + "살 입니다.");
    }

    static int getPopulation() {
        return numberOfPersons;
    }

    public static void main(String[] args) {
        Person anonymous = new Person();
        anonymous.selfIntroduce();
        Person lim = new Person(25, "임덕배");
        lim.selfIntroduce();

        System.out.println(Person.getPopulation() + "명의 인구수가 있습니다.");
    }
}

