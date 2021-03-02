package com.kosta.day11;

public class MySum {
    int first;
    int second;

    MySum (int first, int second){
        this.first = first;
        this.second = second;
    }

    /* 조건1 */
    @Override
    public String toString() {
        return String.valueOf(first + second);
    }
    /* 조건2 */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MySum mySum = (MySum) o;
        return first == mySum.first &&
                second == mySum.second;
    }
}
