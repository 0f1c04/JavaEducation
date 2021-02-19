package com.kosta.day02;

/*
 * 2021.02.16
 * 복습
 * 1. Review.java 소스작성
 * 2. 컴파일 (byte code변경, binary 아님, 중간언어, Assembly와 비슷)
 * 3. JVM이 실행
 */

public class Review {
	// main은 자바가상머신이 자동시
	public static void main(String[] args) {
		System.out.println("main start");
		//dataTypeTest();
		castTest();
		System.out.println("main end");
	}

	private static void castTest() {
		int i;
		char c = 'A';
		i = c;
		System.out.println(i);
		
		c = (char)i;
		c++;
		System.out.println(c);
	}

	private static void dataTypeTest() {
		// 기본 정수형 : byte(1), short(2), char(2), int(4), long(8)
		//	   실수형 : float(4), double(8)
		// 	   논리형 : boolean(1)
		//
		// Wrapper class : 기본형 + 기능 (ex: Integer Class)
		//
		// 목적 : 데이터저장, 연산, 비교
		
		// 1. 변수선언
		int intData;
		long longData = Integer.MAX_VALUE + 1;
		double doubleData = 3.141592;
		float floatData = 3.141592f;
		
		// 2. 값할당(대입)
		intData = 100;
		
		// 3. 사용
		System.out.println(intData + 10);
		System.out.println(longData);
		System.out.println(doubleData);
		System.out.println(floatData);
	}

}
