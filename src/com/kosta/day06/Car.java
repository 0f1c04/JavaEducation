package com.kosta.day06;

/**
 * @author f1c04
 * 복습
 */
public class Car {
    //1. 멤버변수 (field): non-static(instance 변수), static(class 변수)
    private int speed;  //private: 정보은닉, 외부접근불가(상속받아도 불가)
    private boolean stop;
    private static int count;   //object 공유변수
    private final int year;     //instance 변수, final은 한번 초기화, 변경불가능 (초기화: 생성자 or 선언시)
    private static final String COMPANY = "현대자동차"; //상수

    //2. 생성자 (Constructor): new시에 자동호출되는 메소드
    public Car() { //default constructor
        //year = 2021;
        //instance 변수 (자동초기화): speed = 0, stop = false
        //생성자의 overloading 사용시 하나의 생성자가 다른 생성자를 호출시 사용한다.
        this(0, false, 2021);
    }

    public Car(int speed, boolean stop, int year) {
        //매개변수와 멤버변수가 이름충돌시 구별하기 위해 사용
        this.speed = speed;
        this.stop = stop;
        this.year = year;
        count++;
        System.out.println(this.getClass().getSimpleName() + "생성");
    }

    //3. 일반메소드 (getter, setter: 외부에서 접근 가능한 메소드)
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public static int getCount() {
        return count;
    }

//    public static void setCount(int count) {
//        Car.count = count;
//    }

    public int getYear() {
        return year;
    }

    //static method: 객체생성없이 호출가능
    public static String getCOMPANY() {
        return COMPANY;
    }

    public void print() {
        System.out.println("=======Car정보=======");
        System.out.println("speed: " + speed);
        System.out.println("stop: " + stop);
        System.out.println("year: " + year);
        System.out.println("count: " + count);
        System.out.println("COMPANY: " + COMPANY);
    }

    //4. instance block, static block;
    {
        System.out.println("instance block: instance 생성마다 수행");
        System.out.println("***********************************");
    }
    static {
        System.out.println("static block: class가 load시에 수행 (한 번)");
        System.out.println("***************************************");
    }
    //5.
}
/*
class: object를 만드는 틀 (template, 설계도)
object: class를 이용해 만든 독립된 개체

 */