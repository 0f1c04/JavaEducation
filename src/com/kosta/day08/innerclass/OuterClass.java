package com.kosta.day08.innerclass;

public class OuterClass {
    //1. field
    int java = 100;
    static int sql = 90;

    //2. constructor
    //3. method
    void test(String param, String param2) {
        //final 예약어는 생략가능
        String localVar = "매서드내의 지역변수 ... 내부 class에서 사용시 수정불가";
        String localVar2 = "매서드내의 지역변수 ... 내부 사용안함";
        localVar2 = "수정가능";
        param2 = "수정가능";
        //불가 localVar = "aaa";
        //불가 param = "aaa";

        //Inner class: Local class (in the method)
        //-----------method내에서만 사용가능------------
        class LocalClass {
            int price = 1000;
            //static int price2 = 2000; //불가능

            void printPrice() {
                System.out.println("Local instance method   " + price);

                System.out.println(param);
                System.out.println(localVar);
                //불가 param = "aaa";
                //불가 localVar = "aaaa";
            }
//            static void printPrice2() { //불가능
//                System.out.println("Local instance method   " + price);
//            }
        }
        LocalClass local = new LocalClass();
        System.out.println(local.price);
        local.printPrice();
    }

    //4. static block
    //5. inner class
    //Inner class: Instance member class
    class InnerClass {
        int a = 10;
        //static int b = 20; //불가능

        InnerClass() {
            System.out.println("InnerClass constructor");
        }

        void test() {
            System.out.println("InnerClass instance method");
            System.out.println("Outer의 instance 변수 ... java 점수는 " + java);
            System.out.println("Outer의 static 변수 ... sql 점수는 " + sql);
        }
//      static void test2() { //불가능
//          System.out.println("InnerClass instance method");
//      }

    }

    //Inner class: Static member class
    static class StaticInnerClass {
        int score = 100;
        static String grade = "A학점";

        public StaticInnerClass() {
            System.out.println("StaticInnerClass Constructor");
        }

        void printScore() {
            System.out.println("StaticInnerClass instance method   " + score);

            //System.out.println("Outer의 instance 변수 ... java 점수는 " + java); //java는 static이 아니라 불가능
            System.out.println("Outer의 static 변수 ... sql 점수는 " + sql);
        }

        static void printGrade() {
            System.out.println("StaticInnerClass static method   " + grade);

            //System.out.println("Outer의 instance 변수 ... java 점수는 " + java); //불가능
            System.out.println("Outer의 static 변수 ... sql 점수는 " + sql);
        }
    }
}
