package com.kosta.day10;

import java.util.Arrays;

public class PersonTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        sample4();
    }

    private static void sample4() throws CloneNotSupportedException {
        Car car1 = new Car("람보르기니", 55000);
        Car car2 = new Car("벤틀리", 50000);
        String[] phone1 = {"010-1111-1111", "010-2222-2222"};
        String[] phone2 = {"010-3333-3333", "010-4444-4444"};
        Person person1 = new Person("홍길동", 20, car1, phone1);
        Person person2 = new Person("배대장", 30, car2, phone2);
        Person person3 = new Person("배대장", 30, car2, phone2);

        Person person4 = person3; //복제안됨
        person3.setName("임덕배");
        System.out.println("------------복제안됨-------------");
        System.out.println(person3);
        System.out.println(person4);

        System.out.println("------------얕은복제-------------");
        //복제: 원본이 수정되면 복제된 객체는 수정에 영향을 미치지 않는다.
        //얕은복제는 implements Cloneable, clone() 메소드 추가
        //깊은복제는 clone()메소드에 코드추가 필요
        Person person5 = (Person) person3.clone();
        person3.setName("배대장");
        System.out.println(person3);
        System.out.println(person5);
        System.out.println(person3.hashCode());
        System.out.println(person5.hashCode());



        System.out.println("------------깊은복제-------------");
        Person person6 = (Person) person3.clone();
        person3.setName("임덕배");
        System.out.println(person3);
        System.out.println(person6);
        System.out.println(person3.hashCode());
        System.out.println(person6.hashCode());
    }

    private static void sample3() {
        String[] phone1 = {"010-1111-1111", "010-2222-2222"};
        String[] phone2 = {"010-1111-1111", "010-2222-2222"};
        String[] phone3 = {"010-3333-3333", "010-4444-4444"};
        boolean b = Arrays.equals(phone1, phone2);
        System.out.println(b);
    }

    private static void sample2() {
        Car car1 = new Car("람보르기니", 55000);
        Car car2 = new Car("람보르기니", 55000);
        Car car3 = new Car("벤틀리", 50000);

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car1.equals(car2) ? "같음" : "다름");
    }

    private static void sample1() {
        Car car = new Car("람보르기니", 55000);
        Car car2 = new Car("벤틀리", 50000);
        String[] phone1 = {"010-1111-1111", "010-2222-2222"};
        String[] phone2 = {"010-3333-3333", "010-4444-4444"};
        Person person1 = new Person("홍길동", 20, car, phone1);
        Person person2 = new Person("배대장", 30, car2, phone2);
        Person person3 = new Person("배대장", 30, car2, phone2);

        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());
        System.out.println(person2.equals(person3) ? "같음" : "다름");
    }
}
