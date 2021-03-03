package com.kosta.day12;

public class Util {
    public static <T> Box<T> boxing(T t) {
        Box<T> b = new Box<T>();
        b.setObj(t);
        return b;
    }

    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        boolean result = p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
        return result;
    }

    public static <T extends Number> int compare(T a, T b) {
        double d1 = a.doubleValue();
        double d2 = b.doubleValue();

        return Double.compare(d1, d2);
    }

    public static <T extends Machine> int compare2(T a, T b) {
        int result = a.compareTo(b);
        return result;
    }
}
