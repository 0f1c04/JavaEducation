package com.kosta.day06;
//DTO(Data Transfer Object)
//VO(Value Object)

public class QuizMember {
    private String name;
    private String id;
    private String password;
    private int age;

    public QuizMember(String name, String id) {
        this(name, id, null, 0);
    }

    public QuizMember(String name, String id, String password, int age) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;
    }

    @Override
    public String toString() {
        return "QuizMember{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
