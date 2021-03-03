package com.kosta.day12;

public class GenericInheritExample {
    public static void main(String[] args) {
        ChildProduct<TV, String, String> p = new ChildProduct<>(new TV(), "ABC100", 2000, "삼성");
        System.out.println(p.getCompany());
        System.out.println(p);
    }
}
