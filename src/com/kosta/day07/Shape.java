package com.kosta.day07;

/*
abstract class: abstract method가 하나이상 존재한다.
abstract method: 함수의 정의는 있으나 구현은 없다. > 구현은 해당 class를 상속받은 자식클래스에서 반드시 한다.
*/

public abstract class Shape {
    private String color;
    private String type;

    public Shape(String color, String type) {
        this.color = color;
        this.type = type;
    }

    //--------------------------------규격--------------------------------
    //calculateArea: 면적구하기
    public abstract double calculateArea(); //정의는 있고 구현은 없음 (추상 메소드)
    //어떤도형인지 결정되지않아 면적구하기 불가

    //calculatePerimeter(): 둘레구하기
    public abstract double calculatePerimeter(); //정의는 있고 구현은 없음 (추상 메소드)
    //어떤도형인지 결정되지않아 둘레구하기 불가
    //-------------------------------------------------------------------

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(color).append(' ');
        sb.append(type);

        return sb.toString();
    }

}
