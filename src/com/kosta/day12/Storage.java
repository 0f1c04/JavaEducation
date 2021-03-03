package com.kosta.day12;

public interface Storage<T> {
    public abstract void add(T item, int index);
    public T get(int index);
}
