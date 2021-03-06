package com.kosta.day14.chapter15_Collection;

import com.kosta.day13.chapter15_Collection.model.CustomerDTO;
import com.sun.javaws.IconUtil;

import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

public class CollectionTest_TreeMap {
    public static void main(String[] args) {
        method2();
    }

    private static void method2() {
        //HashMap: hashCode(), equals()를 구현해야 동작함
        //TreeMap: Comparable.compareTo()를 구현해야 동작
        TreeMap<Car, CustomerDTO> data = new TreeMap<>();
        data.put(new Car("ABC", 1000),
                new CustomerDTO(1, "고객1", "010-1234-5678", "서울"));
        data.put(new Car("DDD", 5000),
                new CustomerDTO(2, "고객2", "010-1235-5572", "부산"));
        data.put(new Car("EEE", 2000),
                new CustomerDTO(3, "고객3", "010-4574-3412", "가산"));
        data.put(new Car("ZZZ", 7000),
                new CustomerDTO(4, "고객4", "010-3222-8976", "나주"));

        {
            Entry<Car, CustomerDTO> entry = data.firstEntry();
            System.out.println("key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
            System.out.println("==============================================");

            entry = data.lowerEntry(new Car("EEE모델", 2000));
            System.out.println("lower: " + entry);

            System.out.println("==============================================");
        }

        for (Entry<Car, CustomerDTO> entry : data.entrySet()) {
            System.out.println("key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
            System.out.println("----------------------------------------------");
        }

        NavigableMap<Car, CustomerDTO> desc = data.descendingMap();
        for (Entry<Car, CustomerDTO> entry : desc.entrySet()) {
            System.out.println("key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
            System.out.println("----------------------------------------------");
        }
    }

    private static void method1() {
        Map<String, Integer> data = new TreeMap<>();
        data.put("홍길동", 100);
        data.put("고길동", 90);
        data.put("김길동", 80);
        data.put("최길동", 70);
        data.put("박길동", 60);

        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            System.out.println("key: " + entry.getKey());
            System.out.println("value: " + entry.getValue());
            System.out.println("==========================");
        }
    }
}
