package com.kosta.day01;

public class VariableTest5 {
	// test1 함수 정의
	public static void test1() {
		System.out.println("test1 START");
		System.out.println("---자동 형변환---");
		int i;
		byte b = 127;
		i = b;
		System.out.println("i = " + i);
	}

	// test2 함수 정의
	public static void test2() {
		System.out.println("test2 START");
		System.out.println("---강제 형변환---");
		int i = 2147483647;
		byte b;
		b = (byte) i;
		System.out.println("b=" + b);
	}

	// test3 함수 정의
	public static void test3() {
		int a = 10;
		// Wrapper Class
		// 기본 int형(값저장, 연산, 비교)
		// int + 기능추가 -> Integer
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toHexString(a));
		System.out.println(Integer.toOctalString(a));
	}

	// test4 함수 정의
	public static void test4() {
		// 여러타입 연산 --> 결과는 어떤 타입? --> 작은타입이 큰타입으로 변
		int a = 10;
		double b = 3.14;

		double result = a + b;
		System.out.println("result=" + result);
		
		int result2 = (int)(a + b);
		System.out.println("result2=" + result2);
		
		char c = '가';
		String s1 = "자바";
		System.out.println(s1 + 10 + 20);
		System.out.println(s1 + (10 + 20));
		
		int su1 = 10, su2 = 20;
		System.out.println("더하기는 " + (su1 + su2));
		System.out.println("빼기는 " + (su1 - su2));
		System.out.println("곱하기는 " + su1 * su2);
		System.out.println("나누기는 " + su1 / su2);
	}

	// main함수정의 main은 JVM이 자동 호출
	// 나머지는 호출안함
	// 개발자가 main에서 호출해야함
	public static void main(String[] args) {
		System.out.println("main 시작");
		// test1();
		// test2();
		// test3();
		test4();
		System.out.println("main 종료");
	}
}
