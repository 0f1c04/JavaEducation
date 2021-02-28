package com.kosta.day08.innerclass;

//inner class 예제
public class ClassRoom {
    String title1 = "instance 변수";
    static String title2 = "static 변수";

    //1. instance inner class
    class Desk {
        String title3 = "instance inner class ... instance 변수";
        //불가능 static String title4 = "static 변수";
    }

    //2. static inner class
    static class Chair {
        String title5 = "static inner class ... instance 변수";
        static String title6 = "static inner class ... static 변수";
    }

    //3. local inner class
    void test(String param, String param2) {
        final String title8 = "local변수";
        //불가능 final String title8 = "local변수";
        String title9 = "local변수";
        //param = "변수수정"; //local inner class에서 사용하는 변수는 무조껀 final이므로 수정 불가능
        param2 = "변수수정"; //param2는 사용한적 없기 때문에 수정가능
        class Computer {
            String title7 = "local inner class ... instance 변수";
            //불가능 String title8 = "static 변수";

            void print() {
                System.out.println(param);
                System.out.println(title8);
            }
        }
        Computer cc = new Computer();
        cc.print();
        System.out.println(cc.title7);
    }
}
