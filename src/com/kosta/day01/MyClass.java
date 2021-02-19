package com.kosta.day01;

/*
 * 1. .java 생성
 * 2. javac.exe로 컴파일 (jdk안에 있음)
 * 3. .class파일이 생성됨
 * 4. JVM(Java Virtual Machine, OS마다 다름)이 java.exe이 .class실행(main 자동호출)
 * 
 * -------------------------------------------------------------
 * 
 * MyClass.java에는 반드시 MyClass가 있다.
 * 하나의 .java에는 여러 class 선언 가능하다.
 * public class는 하나만 가능하다.
 * main method가 없으면 자체 실행불가
 */
public class MyClass {
	public static void test() {
		System.out.println("MyClasss's test");
	}
	public static void main(String[] args ) {
		ATest aa = new ATest();
		aa.method1();
	}
}

class ATest {
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("ATest's method1");
	}
	
}

class BClass {
	
}
