package com.kosta.day15;

import java.util.*;

public class Review {
    //Collection: List, Set, Map
    //List: 순서o, 중복o ... ArrayList, LinkedList, Vector
    //Set: 순서x 중복x, key로 사용 ... HashSet, TreeSet
    //Map: key, value의 쌍으로 이루어짐(entry) ... HashMap, TreeMap, Properties
    //Stack(LIFO), Queue(FIFO) ... LinkedList(Queue), Stack(Stack Class)
    public static void main(String[] args) {
        method5();
    }

    private static void method5() {
        //key, value
        Map<Student, Integer> data = new TreeMap<>();
        data.put(new Student("홍길동", 50), 1);
        data.put(new Student("박길동", 150), 2);
        data.put(new Student("김길동", 250), 3);
        data.put(new Student("임길동", 510), 4);
        data.put(new Student("홍길동", 450), 5);
    }

    private static void method4() {
        //key, value
        Map<Student, Integer> data = new HashMap<>();
        data.put(new Student("홍길동", 50), 1);
        data.put(new Student("박길동", 150), 2);
        data.put(new Student("김길동", 250), 3);
        data.put(new Student("임길동", 510), 4);
        data.put(new Student("홍길동", 450), 5);

        System.out.println(data.size());
        System.out.println("Entry 얻기");
        for (Map.Entry<Student, Integer> entry : data.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }
        System.out.println("key 얻기");
        for (Student st : data.keySet()) {
            System.out.println("Key: " + st);
            System.out.println("Value: " + data.get(st));
        }
    }

    private static void method3() {
        TreeSet<Student> data = new TreeSet<>();
        data.add(new Student("홍길동", 50));
        data.add(new Student("박길동", 150));
        data.add(new Student("김길동", 250));
        data.add(new Student("임길동", 510));
        data.add(new Student("홍길동", 450));

        System.out.println(data.size());
        for (Student str : data) {
            System.out.println(str);
        }

        System.out.println("Descending sort");
        for (Student str : data.descendingSet()) {
            System.out.println(str);
        }
    }

    private static void method2() {
        //Set은 동일객체인지 체크 : hashcode와 equals를 통해 체크함
        //Set<String> datas = new HashSet<String>();

        //TreeSet : binary sort > tree구조로 정렬 : compareTo()
        Set<String> datas = new TreeSet<String>();
        datas.add("자바");
        datas.add(new String("자바3"));
        datas.add(new String("자바"));
        datas.add(new String("자바2"));
        datas.add(new String("자바"));
        System.out.println(datas.size());
        for (String str : datas) {
            System.out.println(str);
        }
    }

    private static void method1() {
        //List<String> data = new ArrayList<String>();
        //List<String> data = new LinkedList<>();
        List<String> data = new Vector<>();

        data.add("자바");
        data.add("자바");
        data.add("자바");
        data.add(new String("자바"));
        System.out.println(data.size());
        for (String s : data) {
            System.out.println(s);
        }
    }

}