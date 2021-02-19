package com.kosta.day05;

class Duck {
    //member variable: instance variable(non-static), class variable(static)
    String name;
    static int legs = 2;
    int length;

    void fly() {
        System.out.println("오리(" + name + ")는 날지 않습니다.");
    }

    void sing() {
        System.out.println("오리(" + name + ")가 소리내어 웁니다.");
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "오리의 이름은 "+name+" 입니다.";
    }
}

class Sparrow {
    //member variable: instance variable(non-static), class variable(static)
    String name;
    static int legs = 2;
    int length;

    void fly() {
        System.out.println("참새(" + name + ")는 날지 않습니다.");
    }

    void sing() {
        System.out.println("참새(" + name + ")가 소리내어 웁니다.");
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "참새의 이름은 "+name+" 입니다.";
    }
}

public class PlayBird {
    public static void main(String[] args) {
        //static은 객체생성(new)과 무관하다.
        System.out.println("오리의 다리수는 "+Duck.legs);
        System.out.println("참새의 다리수는 "+Sparrow.legs);

        Duck d = new Duck();
        d.name = "꽥꽥이";
        d.setName("꽥꽥이2");
        d.fly();
        d.sing();
        String s = d.toString();
        System.out.println(s);
        System.out.println(d);

        Sparrow sparrow = new Sparrow();
        sparrow.name = "짹짹이";
        sparrow.setName("짹짹이2");
        sparrow.fly();
        sparrow.sing();
        System.out.println(sparrow);
    }
}
