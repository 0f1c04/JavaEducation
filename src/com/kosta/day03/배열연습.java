package com.kosta.day03;

import java.util.Arrays;

public class 배열연습 {
    //명령행(커맨드라인) 매개변수
    //>java 배열연습 100 200
    public static void main(String[] args) {
        //method1();
        //method2();
        //method3();
        System.out.println(args.length + "개 파라미터가 들어옴");
    }

    private static void method3() {
        //배열생성시 개수는 필수
        //자동초기화, null로 초기화
        String[] arr = new String[5];

        //초기화하면서 생성시 개수 사용 불가
        String[] arr2 = new String[]{"java", "sql", "html5", "css3", "javascript"};
        String[] arr3 = {"java", "sql", "html5", "css3", "javascript"};

        String[] arr4;
        arr4 = new String[]{"java", "sql", "html5", "css3", "javascript"};
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }

        //선언하고 생성하면서 초기화 x
        String[] arr5;
        //arr5 = {"java", "sql", "html5", "css3", "javascript"}; //error}

        //확장for, 향상된 for
        for (String s : arr4) {
            System.out.println(s);
        }
    }

    private static void method2() {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));

        // 기본형이 아닌 경우 null로 초기화
        String[] arr2 = new String[5];
        System.out.println(Arrays.toString(arr2));
    }

    private static void method1() {
        //1.배열변수 선언
        int[] score1 = null;
        double[] score2 = null;

        //2. 배열 생성
        score1 = new int[30];
        score2 = new double[5];

        //3. 배열 사용
        System.out.println(score1.length);
        System.out.println(score1[0]);
    }

}
