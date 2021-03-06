package com.kosta.day14.chapter15_Collection;

import com.kosta.day13.chapter15_Collection.model.CustomerDTO;

import java.util.*;

public class CollectionTest_List {
    public static void main(String[] args) {
        method7();
    }

    private static void method7() {
        Set<CustomerDTO> data = new HashSet<>();

        CustomerDTO c1 = new CustomerDTO(100, "홍길동", "010-1234-5678", "서울");
        CustomerDTO c2 = new CustomerDTO(100, "홍길동", "010-4342-7812", "광주");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        data.add(c1);
        data.add(c2);
        data.add(new CustomerDTO(300, "박길동", "010-4434-5645", "울산"));
        data.add(new CustomerDTO(400, "최길동", "010-2234-5741", "경기"));
        data.add(new CustomerDTO(200, "홍길동", "010-1234-5678", "서울"));
        //Set은 중복을 허용하지 않는데 위에 마지막 홍길동과 첫 번째 홍길동은 중복이 허용되버림
        //주소값이 다르기 때문
        //그래서 DTO에 중복체크 코드를 추가 (equals(), hashCode() Override ㄱ ㄱ)

        System.out.println(data);
        for (CustomerDTO c : data) {
            System.out.println(c);
        }
    }

    private static void method6() {
        Set<String> set = new HashSet<>();
        set.add("월요일");
        set.add("화요일");
        set.add("수요일");
        set.add("토요일");
        set.add("토요일");
        set.add("일요일");
        System.out.println(set.size() + "개"); //중복을 허용하지 않는다.
        System.out.println(set); //toString() override
    }

    private static void method5() { //Set
        //Set interface를 구현한 class: HashSet, TreeSet, LinkedHashSet
        //순서가 없다. 중복이 불가하다. 키로 사용된다.
        Set<String> set = new HashSet<>();

        set.add("월요일");
        set.add("화요일");
        set.add("토요일");
        set.add("토요일");
        set.add("일요일");
        System.out.println(set.size() + "개"); //중복을 허용하지 않는다.

        //1.일반 for로 읽기 ... 불가
        //2.확장 for로 읽기 ... 가능 (순서는 없음)
        for (String s : set) {
            System.out.print(s + " ");
        }
        System.out.println();
        //3.Iterator로 읽기(반복자)
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            System.out.print(iterator.next() + " "); //읽을게 없으면 NoSuchElementException 발생
        }
    }

    private static void method4() {
        String[] days = {"월요일", "화요일", "수요일", "목요일", "토요일", "토요일", "일요일"};
        //배열을 List로 변경
        List<String> list = Arrays.asList(days);
        print(list);
        System.out.println();
        System.out.println(list.contains("일요일") ? "있음" : "없음");

        //3.Iterator 반복자 이용해서 읽기
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.print(s + " ");
        }
        System.out.println("모두 읽음");
    }

    private static void method3() { //Vector
        //List 인터페이스를 구현한 class: Vector
        //순서가 있다. 중복을 허용한다.
        List<String> list = new Vector<>();
        String[] days = {"월요일", "화요일", "수요일", "목요일", "토요일", "토요일", "일요일"};
        for (String s : days) {
            list.add(s);
        }
        for (String s : list) {
            System.out.print(s + " ");
        }
    }

    private static void method2() { //LinkedList
        //List 인터페이스를 구현한 class: LinkedList
        //순서가 있다. 중복을 허용한다. 체인처럼 관리
        List<String> list = new LinkedList<>();
        String[] days = {"월요일", "화요일", "수요일", "목요일", "토요일", "토요일", "일요일"};
        for (String s : days) {
            list.add(s);
        }
        for (String s : list) {
            System.out.print(s + " ");
        }
    }

    private static void method1() { //ArrayList
        //List 인터페이스를 구현한 class: ArrayList
        //순서가 있다. 중복을 허용한다.
        List<String> list = new ArrayList<>(3);
        String[] days = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
        for (String s : days) {
            list.add(s);
        }
        //함수연습
        //get()
        String s = list.get(6);
        System.out.println("6번쨰 값: " + s);
        //contains(), clear()
        if (list.contains("화요일")) { //검색
            System.out.println("화요일이 있습니다.");
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + "번째-->" + list.get(i));
        }
    }

    private static void print(List<String> list) {
        for (String s : list) {
            System.out.print(s + " ");
        }
    }

    private static void print2(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + "번째-->" + list.get(i));
        }
    }
}
