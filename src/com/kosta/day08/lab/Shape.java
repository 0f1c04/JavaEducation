package com.kosta.day08.lab;

public abstract class Shape {
    int numSides; //변의 수

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    public abstract double getArea(); //넓이

    public abstract double getPerimeter(); //넓이
}
