package com.kosta.day07;

public class Circle extends Shape {
    int radius;
    double circumference;

    Circle(String color, int radius) {
        super(color, "Circle");
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        circumference = 2 * radius * Math.PI;
        return circumference;
    }
}
