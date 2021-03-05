package com.kosta.day14.chapter15_Collection;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) throws IOException {
        method1();
    }

    private static void method1() throws IOException {
        Properties pro = new Properties();
        String fsrc = "src/com/kosta/day14/chapter15_Collection/oracleInfo.properties";
        pro.load(new FileReader(fsrc));
        for(Entry entry:pro.entrySet()) {
            System.out.println("key: " + entry.getKey());
            System.out.println("value: " + entry.getValue());
            System.out.println("==========================");
        }
    }
}
