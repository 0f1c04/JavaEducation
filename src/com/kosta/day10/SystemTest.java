package com.kosta.day10;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SystemTest {
    public static void main(String[] args) {
        method4();
    }

    private static void method4() {
        Map<String, String> envs = System.getenv();
        Set<String> keys = envs.keySet();
        for (String s : keys) {
            System.out.println(s + " ==> " + System.getenv(s));
        }
    }

    private static void method3() {
        System.out.println(System.getenv("JAVA_HOME"));
        System.out.println(System.getenv("path"));
    }

    private static void method2() {
        //Properties에는 키와 값이 쌍으로 들어있다. Map
        Properties ps = System.getProperties();
        Set<Object> keys = ps.keySet();
        for (Object obj : keys) {
            System.out.println(obj + " ==> " + System.getProperty((String) obj));
        }
    }

    private static void method1() {
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("os.name"));
    }
}
