package com.kosta.day12.examQuiz;

public class Container1<T> {
    private T value;

    public Container1() {

    }

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }
}
