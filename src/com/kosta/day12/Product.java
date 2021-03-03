package com.kosta.day12;

public class Product<T, M> {
    private T kind;
    private M model;
    private int price;

    public Product(T kind, M model, int price) {
        this.kind = kind;
        this.model = model;
        this.price = price;
    }

    public Product() {

    }

    public T getKind() {
        return kind;
    }

    public void setKind(T kind) {
        this.kind = kind;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "kind=" + kind +
                ", model=" + model +
                ", price=" + price +
                '}';
    }
}
