package com.kosta.day12;

public class ChildProduct<T, M, C> extends Product<T, M> {
    private C company;
    public ChildProduct(T kind, M model, int price, C company) {
        super(kind, model, price);
        this.company = company;
    }

    public ChildProduct() {
        super();
    }

    public C getCompany() {
        return company;
    }

    public void setCompany(C company) {
        this.company = company;
    }
}
