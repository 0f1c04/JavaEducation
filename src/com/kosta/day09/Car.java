package com.kosta.day09;

import java.util.Arrays;

public class Car implements Cloneable{
    String model;
    int price;
    String[] 악세사리;

    public Car(String model, int price, String[] 악세사리) {
        this.model = model;
        this.price = price;
        this.악세사리 = 악세사리;
    }

    public Car(String model, int price) {
        super();
        this.model = model+"*";
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("model='").append(model).append('\'');
        sb.append(", price=").append(price);
        sb.append(", 악세사리=").append(Arrays.toString(악세사리));
        sb.append('}');
        return sb.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Car car = (Car)super.clone(); //얕은복사
        car.악세사리 = Arrays.copyOf(this.악세사리, this.악세사리.length); //깊은복사
        return car;
    }

    @Override
    public boolean equals(Object obj) {
        //Car -> Object -> Car
        if(!(obj instanceof Car)) return false;
        Car cc = (Car)obj;
        return model.equals(cc.model) && price == cc.price;
    }

    @Override
    public int hashCode() {
        return model.hashCode();
    }
}