package com.kosta.day07;

public class Rectangle extends Shape{
    int width;
    int height;
    public Rectangle(String color, int width, int height) {
        super(color, "Rectangle");
        this.width = width;
        this.width = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}
