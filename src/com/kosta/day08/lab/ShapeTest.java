package com.kosta.day08.lab;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] arrayList = new Shape[2];
        arrayList[0] = new Rectangle(5, 6);
        arrayList[1] = new RectTriangle(6, 2);

        for(Shape arr:arrayList) {
            System.out.println("area: " + arr.getArea());
            System.out.println("perimeter: " + arr.getPerimeter());
            if(arr instanceof Resizable) {
                ((Resizable)arr).resize(0.5);
                System.out.println("new area: " + arr.getArea());
                System.out.println("new perimeter: " + arr.getPerimeter());
            }
        }
    }
}
