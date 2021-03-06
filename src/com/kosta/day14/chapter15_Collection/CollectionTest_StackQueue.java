package com.kosta.day14.chapter15_Collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CollectionTest_StackQueue {
    public static void main(String[] args) {
        method2();
    }

    private static void method2() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("월");
        queue.offer("화");
        queue.offer("수");
        queue.offer("목");
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println("size: " + queue.size());

//        int count = queue.size();
//        for(int i = 0; i < count; i++) {
//            System.out.println(i + "-->" + queue.poll());
//        }

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println("size: " + queue.size());
    }

    private static void method1() { //Stack
        //Stack(LIFO: Last In First Out)
        Stack<String> stack = new Stack<>();
        stack.push("월");
        stack.push("화");
        stack.push("수");
        stack.add("목");
        stack.add("금");
        System.out.println(stack.size());
        System.out.println(stack.get(stack.size() - 1));
        System.out.println(stack.peek());
    }
}
