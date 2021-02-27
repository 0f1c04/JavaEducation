package com.kosta.day09;

public class OuterClass extends Object implements Comparable<OuterClass> {
    //1. field: non-static, static
    //2. constructor
    //3. method:non-static, static
    //4. static block, instance block
    //5. inner class, inner interface
    class InnerClass {

    }

    static class InnerClass2 {

    }

    void test() {
        class InnerClass3 {

        }
        InnerClass3 aa = new InnerClass3();
    }

    @Override
    public int compareTo(OuterClass o) {
        return 0;
    }
}
