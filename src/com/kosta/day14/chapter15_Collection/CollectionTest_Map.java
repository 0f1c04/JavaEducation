package com.kosta.day14.chapter15_Collection;

import com.kosta.day13.chapter15_Collection.model.CustomerDTO;

import java.util.*;
import java.util.Map.Entry;

public class CollectionTest_Map {
    public static void main(String[] args) {
        method6();
    }

    private static void method6() {
        Properties map = System.getProperties();
        for(Entry entry:map.entrySet()) {
            System.out.println("key: " + entry.getKey());
            System.out.println("value: " + entry.getValue());
            System.out.println("==========================");
        }
    }

    private static void method5() {
        Map<String, String> map = System.getenv();
        for(Entry<String, String> entry:map.entrySet()) {
            System.out.println("key: " + entry.getKey());
            System.out.println("value: " + entry.getValue());
            System.out.println("==========================");
        }
    }

    private static void method4() { //왜 안되냐
        Map map = new Properties();
        map.put("자바", "이것이자바다");
        map.put("SQL", "SQL정복");
        map.put("HTML", "WEB정복");
//        for(Entry<String, String> entry:map.entrySet()) {
//            System.out.println("key: " + entry.getKey());
//            System.out.println("value: " + entry.getValue());
//            System.out.println("==========================");
//        }
    }

    private static void method3() { //HashTable
        Map<Student2, CustomerDTO> map = new Hashtable<>();
        map.put(new Student2("학생1", "남", 100), new CustomerDTO(1, "고객1", "02-1234-5678", "Seoul"));
        map.put(new Student2("학생2", "남", 100), new CustomerDTO(2, "고객2", "02-1234-5678", "Seoul"));
        map.put(new Student2("학생3", "남", 100), new CustomerDTO(3, "고객3", "02-1234-5678", "Seoul"));

        //제거하기 (전체)
        //map.clear();
        //제거하기 (1개)
        CustomerDTO cust = map.remove(new Student2("학생3", "남", 100));
        System.out.println(cust + " 삭제");

        //출력
        for(Map.Entry<Student2, CustomerDTO> entry:map.entrySet()) {
            System.out.println("key: " + entry.getKey());
            System.out.println("value: " + entry.getValue());
            System.out.println("==========================");
        }
    }

    private static void method2() {
        Map<String, Integer> map = new HashMap<>();
        map.put("홍길동", 100);
        map.put("홍길동", 90);
        map.put("박길동", 100);
        map.put("최길동", 100);
        map.put("고길동", 100);

        //키가있는지?
        System.out.println(map.containsKey("박길동2"));
        //값이있는지?
        System.out.println(map.containsValue(90));

        Collection<Integer> scores = map.values();
        int sum = 0;
        for(Integer score : scores) {
            sum+=score;
        }
        System.out.println("총점 : " + sum);
    }

    private static void method1() { //HashMap
        //Map interface 구현 class: HashMap, TreeMap, Properties ...
        //키와 값의 쌍 (Map.Entry)
        //키는 중복 저장될 수 없지만 값은 중복 저장 가능
        //만약 기존에 저장된 키와 동일한 키로 값을 저장하면 기존값 삭제 후 새로운 값 대체 (덮어쓰기)
        Map<String, Integer> map = new HashMap<>();
        map.put("홍길동", 100);
        map.put("홍길동", 90);
        map.put("박길동", 100);
        map.put("최길동", 100);
        map.put("고길동", 100);
        System.out.println(map);

        //키를 이용하여 값을 획득
        int value = map.get("홍길동");
        System.out.println("value=" + value);

        //모든키를 얻기
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + "-->" + map.get(key));
        }

        //Entry 얻기
        //Iterator 사용
        Set<Map.Entry<String, Integer>> entrys = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrys.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("---------");
            System.out.println("키: " + entry.getKey());
            System.out.println("값: " + entry.getValue());
        }
        System.out.println("=============================");
        //확장 for문 사용
        for(Map.Entry<String, Integer> entry:map.entrySet()) {
            System.out.println("---------");
            System.out.println("키: " + entry.getKey());
            System.out.println("값: " + entry.getValue());
        }
    }
}