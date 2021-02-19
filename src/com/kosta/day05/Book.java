package com.kosta.day05;

//업무로직(business logic)
//DTO(Data Transfer Object) 데이터를 전송하기위한 객체
//VO(Value Object) 값 객체
//Beans 기술:변수는 private 접근제한자, 메소드는 public 접근제한자
public class Book {
    private String title;
    private int price;

    public Book() {
        //default 생성자
    }

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
