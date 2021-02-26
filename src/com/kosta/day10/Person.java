package com.kosta.day10;

import java.util.Arrays;
import java.util.Objects;

public class Person implements Cloneable {
    private String name;
    private int age;
    private Car car;
    private String[] phone;

    public Person(String name, int age, Car car, String[] phone) {
        this.name = name;
        this.age = age;
        this.car = car;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String[] getPhone() {
        return phone;
    }

    public void setPhone(String[] phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", car=").append(car);
        sb.append(", phone=").append(Arrays.toString(phone));
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(car, person.car) && Arrays.equals(phone, person.phone);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        //얕은 복제
//        Person person = (Person)super.clone();
//        return person;
        //깊은 복제
        Person p = (Person) super.clone();
        p.car = new Car(car.getModel(), car.getPrice());
        p.phone = Arrays.copyOf(phone, phone.length);
        return p;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
