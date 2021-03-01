package com.kosta.day04;

//class : object를 만드는 틀 (template, 설계도) (변수와 메서드들의 묶음)
//object : class를 이용해서 만든 독립된 개체 
//instance : object실체
public class Car {
    //1.특징, 멤버변수, field
    String model;
    String color;
    String company = "현대자동차";
    int year;
    int price;

    //2.생성자 메서드: 생성시(new) 자동수행됨 / return을 가질 수 없다.
    //생성자의 목적 : 초기화
    //생성자의 다형성 : 오버로딩 (이름같고 매개변수 다름)
    //this : 현재 객체의 필드(멤버변수)를 가르켜줌 (매개변수와 멤버변수가 충돌되는 경우)
    //생성자는 여러개 / 하나의 생성자가 다른생성자를 호출하는 경우
    public Car() {
        this("모델미결정", 2000);
    }

    public Car(String model, int price) {
        System.out.println("(매개변수2 생성자)자동차가 생성됩니다.");
        this.model = model;
        this.price = price;
    }

    public Car(String model) {
        this(model, 4000);
    }

    //3.기능, 메서드, 함수
    void go() {
        System.out.println("move");
    }

    void back() {
        System.out.println("back");
    }
}
