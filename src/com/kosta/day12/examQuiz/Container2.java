package com.kosta.day12.examQuiz;

public class Container2<K, V> {
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void set(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Container2{");
        sb.append("key=").append(key);
        sb.append(", value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
