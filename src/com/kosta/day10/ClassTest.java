package com.kosta.day10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        method3();
    }

    private static void method6(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class cls2 = Class.forName(className);
        System.out.println("---------------------");
        System.out.println(cls2.getSimpleName());
        System.out.println("---------------------");

        //객체얻기
        Object obj = cls2.newInstance();
        if (obj instanceof Book) {
            String s = ((Book) obj).getTitle();
            System.out.println(s);
        }
        if (obj instanceof Car) {
            String s = ((Car) obj).getModel();
            System.out.println(s);
        }
    }

    private static void method5(String className) throws ClassNotFoundException {
        Class cls2 = Class.forName(className);
        System.out.println("---------------------");
        System.out.println(cls2.getSimpleName());
        System.out.println("---------------------");

        Method[] methods = cls2.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("함수 이름: " + m.getName());
            Class[] cc = m.getParameterTypes();
            for (Class c : cc) {
                System.out.println("함수 타입: " + c.getName());
            }
        }
    }

    private static void method4(String className) throws ClassNotFoundException {
        Class cls2 = Class.forName(className);
        System.out.println("---------------------");
        System.out.println(cls2.getSimpleName());
        System.out.println("---------------------");

        Field[] fields = cls2.getDeclaredFields();
        for (Field f : fields) {
            System.out.println("변수 이름: " + f.getName());
            System.out.println("변수 타입: " + f.getType().getSimpleName());
        }
    }

    private static void method3() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        method6("com.kosta.day10.Book");
        method6("com.kosta.day10.Car");
    }

    private static void method2(String className) throws ClassNotFoundException {
        Class cls2 = Class.forName(className);
        System.out.println("---------------------");
        System.out.println(cls2.getSimpleName());
        System.out.println("---------------------");


        Constructor[] constructor = cls2.getDeclaredConstructors();
        for (Constructor cc : constructor) {
            System.out.println("생성자 이름: " + cc.getName());
            System.out.println("파라메타 개수: " + cc.getParameterCount());
            Class[] aa = cc.getParameterTypes();
            for (Class c : aa) {
                System.out.println(c.getName());
            }
        }
    }

    private static void method1() {
        Book b = new Book("이것이 자바다", 10000, false);
        Class cls1 = b.getClass();
        System.out.println(cls1.getName());
        System.out.println(cls1.getPackage());
        System.out.println(cls1.getModifiers());
        try {
            Class cls2 = Class.forName("com.kosta.day10.Book");
            System.out.println(cls2.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
