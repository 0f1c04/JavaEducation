package com.kosta.day07;

//final Class, final Method

public class MyClass extends Object{
    public MyClass() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

//    public final Class<?> getClass() { //final class라서 재정의 안됨
//
//    }
}
