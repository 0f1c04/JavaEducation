package com.kosta.day10;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTest {
    public static void main(String[] args) throws IOException {
        method8();
    }

    private static void method8() {
        //String: 고정문자열, 절대로 변경할수 없다
        String s = new String("고정문자열");
        System.out.println(System.identityHashCode(s));
        s = s + " 수정 ... 실제수정되지않는다. 그냥 새로만드는거임";
        System.out.println(s);
        System.out.println(System.identityHashCode(s));

        //StringBuffer, StringBuilder: 가변문자열, 변경가능, +연산자불가능
        StringBuffer stringBuffer = new StringBuffer("가변문자열");
        System.out.println(System.identityHashCode(stringBuffer));
        // 불가능 sb = sb + "aaaa";
        stringBuffer.append(" 수정 ... 실제수정된다.");
        System.out.println(System.identityHashCode(stringBuffer)); //주소값도 같음
        System.out.println(stringBuffer);

        stringBuffer.replace(6, 8, "***");
        System.out.println(stringBuffer);
    }

    private static void method7() {
        //문자열 분리 StringTokenizer
        String s = "배대장,임덕배-그리즐리&아이스베어 판다";
        StringTokenizer st = new StringTokenizer(s, ",|-|&| ");
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        System.out.println(st.countTokens());
    }

    private static void method6() {
        //split
        String s = "배대장,임덕배-그리즐리&아이스베어 판다";
        String[] names = s.split(",|-|&| ");
        for (String n : names) {
            System.out.println(n);
        }
    }

    private static void method5() throws IOException {
        byte[] arr = new byte[100];
        int count = System.in.read(arr);
        System.out.println(count + " :입력 자리수");
        System.out.println(Arrays.toString(arr));
        System.out.println("*" + new String(arr, 0, count - 2) + "*");
        System.out.println("---------------------------");
    }

    private static void method4() throws IOException {
        int a;
        while ((a = System.in.read()) != -1) {
            System.out.println(a);
        }
    }

    private static void method3() {
        String s = "자바가 참 재밌다.";

        //indexOf, length, replace
        System.out.println(s.indexOf("참"));
        System.out.println(s.length());
        System.out.println(s.replace("참", "개")); //원본수정불가
        System.out.println(s); //자바가 참 재밌다.

        //substring
        System.out.println(s.substring(4));
        System.out.println(s.substring(4, 5));

        //toUpperCase, toLowerCase
        s = "Hello world";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        //trim
        s = "       Hello World        ";
        System.out.println("*" + s + "*");
        System.out.println("*" + s.trim() + "*");

        //valueOf
        System.out.println(String.valueOf(false));
        System.out.println(String.valueOf('a'));
        System.out.println(String.valueOf(123)); //숫자->문자
        String s2 = 123 + "";
    }

    private static void method2() throws UnsupportedEncodingException {
        String s = "자바가 참 재밌다.";

        //charAt
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(4));

        s = "A Hello World";
        byte[] arr = s.getBytes();
        System.out.println(Arrays.toString(arr));

    }

    private static void method1() {
        String s1 = "리터럴";
        //생성자 이용
        String s2 = new String("생성자이용");

        byte[] arr = {65, 66, 67};
        char[] arr2 = {'A', 'B', 'C'};

        String s3 = new String(arr);
        String s4 = new String(arr2);

        byte[] arr3 = new byte[100];
        int count = method2(arr3);
        String s5 = new String(arr3, 0, count);
        System.out.println(s5);
    }

    private static int method2(byte[] bytes) {
        System.out.println("입력>>");
        int count = 0;
        try {
            count = System.in.read(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}
