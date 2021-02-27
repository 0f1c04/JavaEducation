package com.kosta.day10;

import java.util.Arrays;

public class Person implements Cloneable {

    private String name;
    private int age;
    private Car car;
    private String[] phone;

    public Person(String name, int age, Car car, String[] phone) {
        super();
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
        StringBuilder builder = new StringBuilder();
        builder.append("Person [name=").append(name).append(", age=").append(age).append(", car=").append(car)
                .append(", phone=").append(Arrays.toString(phone)).append("]");
        return builder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Person)) return false;
        Person otherPerson = (Person) obj;
        boolean result = name.equals(otherPerson.name)
                && this.age == otherPerson.age
                && car == otherPerson.car
                && Arrays.equals(phone, otherPerson.phone);
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //구현을 하지 않아도 얕은 복제는 지원
        //깊은복제
        //1. 먼저 얕은 복제를 실행해서 name과 age를 복사한다. (car와 phone은 복사되지 않음 > 같은 주소를 보고있음)
        Person p = (Person) super.clone();
        //2. car를 새로 만들어서 복사해준다.
        p.car = new Car(car.getModel(), car.getPrice());
        //3. phone을 새로만들어서 복사한다.
        p.phone = Arrays.copyOf(phone, phone.length);
        return p;
    }

}
