package com.kosta.day14.chapter15_Collection;

import com.kosta.day13.chapter15_Collection.model.CustomerDTO;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTest_TreeSet {
    public static void main(String[] args) {
        method5();
    }

    private static void method5() { //정렬 바꾸기
        TreeSet<CustomerDTO> data = new TreeSet<>();
        data.add(new CustomerDTO(1, "고객1", "010-111-1111", "서울"));
        data.add(new CustomerDTO(2, "고객2", "010-121-1111", "부산"));
        data.add(new CustomerDTO(3, "고객3", "010-131-1111", "서울"));
        data.add(new CustomerDTO(4, "고객4", "010-141-1111", "부산"));
        data.add(new CustomerDTO(4, "고객4", "010-141-1111", "서울"));

        NavigableSet<CustomerDTO> descendingSet = data.descendingSet();
        for (CustomerDTO cust : descendingSet) {
            System.out.println(cust);
        }

        NavigableSet<CustomerDTO> ascendingSet = descendingSet.descendingSet();
        for (CustomerDTO cust : ascendingSet) {
            System.out.println(cust);
        }

    }

    private static void method4() {
        TreeSet<CustomerDTO> data = new TreeSet<>();
        data.add(new CustomerDTO(1, "고객1", "010-111-1111", "서울"));
        data.add(new CustomerDTO(2, "고객2", "010-121-1111", "부산"));
        data.add(new CustomerDTO(3, "고객3", "010-131-1111", "서울"));
        data.add(new CustomerDTO(4, "고객4", "010-141-1111", "부산"));
        data.add(new CustomerDTO(4, "고객4", "010-141-1111", "서울"));

        //pollFirst: 제일 낮은 객체를 가져오고 컬렉션 제거
        while (!data.isEmpty()) {
            CustomerDTO cust = data.pollFirst();
            System.out.println(cust);
            System.out.println(data.size() + "명");
        }

        //pollLast: 제일 높은 객체를 가져오고 컬렉션 제거 //위에서 다 제거했으므로 의미없음
        while (!data.isEmpty()) {
            CustomerDTO cust = data.pollLast();
            System.out.println(cust);
            System.out.println(data.size() + "명");
        }
    }

    private static void method3() {
        TreeSet<CustomerDTO> data = new TreeSet<>();
        data.add(new CustomerDTO(1, "고객1", "010-111-1111", "서울"));
        data.add(new CustomerDTO(2, "고객2", "010-121-1111", "부산"));
        data.add(new CustomerDTO(3, "고객3", "010-131-1111", "서울"));
        data.add(new CustomerDTO(4, "고객4", "010-141-1111", "부산"));
        data.add(new CustomerDTO(4, "고객4", "010-141-1111", "서울"));

        //첫 번째 노드 구하기
        System.out.println("첫 번째 노드: " + data.first());
        //마지막 노드 구하기
        System.out.println("마지막 노드: " + data.last());

        for (CustomerDTO cust : data) {
            System.out.println(cust);
        }
    }

    private static void method2() {
        Set<String> data = new TreeSet<>();
        data.add("월");
        data.add("화");
        data.add("수");
        data.add("목");
        data.add("목"); //중복허용x
        for (String s : data) {
            System.out.println(s);
        }
    }

    private static void method1() { //TreeSet
        //TreeSet은 값을 넣을때 이진노드(binary tree)이용, 크기를 비교해서 크면 오른쪽 노드, 작으면 왼쪽 노드에 저장
        TreeSet<Integer> data = new TreeSet<>();
        data.add(100);
        data.add(50);
        data.add(70);
        data.add(30);
        data.add(30); //중복허용x

        //first: 첫 번째 노드 구하기
        System.out.println("첫 번째 노드: " + data.first());
        //last: 마지막 노드 구하기
        System.out.println("마지막 노드: " + data.last());

        //lower: 기준보다 바로 밑 노드
        System.out.println("기준보다 바로 아래의 노드: " + data.lower(50));

        //higher: 기준보다 바로 위 노드
        System.out.println("기준보다 바로 위의 노드: " + data.higher(new Integer(50)));

        //floor: 주어진 객체와 동등한 객체가 있으면 리턴, 없으면 바로 아래 리턴턴
        System.out.println("기준보다 같거나 아래의 노드: " + data.floor(50));

        //ceiling: 주어진 객체와 동등한 객체가 있으면 리턴, 없으면 바로 위 리
        System.out.println("기준보다 같거나 위의 노드: " + data.ceiling(50));

        for (Integer i : data) {
            System.out.println(i);
        }
    }
}
