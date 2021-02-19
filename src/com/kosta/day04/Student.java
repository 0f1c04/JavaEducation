package com.kosta.day04;

//class (object들의 공통된 특성, 행동)
public class Student {
	// 1.멤버변수 선언 (필드)
	String name;	
	String major;
	String no;
	int age;

	// 2.생성자 메서드 선언 (생성시 자동호출 : 초기화 목적)
	// 정의하지않는다면 Default 생성자 제공
	// 정의한다면 Default 생성자 없어짐 (사용불가)
	public Student() {
		//default 생성자 : argument없음
		System.out.println("Default 생성자 생성: No argument");
	}
	public Student(String name, int age) {
		//생성자가 다른모양의 생성자를 호출
		this(name, null, null, age);
	}
	public Student(String name, String major) {
		//생성자가 다른모양의 생성자를 호출
		this(name, major, null, 20);
	}
	public Student(String name, String major, String no, int age) { //오버로딩
		System.out.println("=======================학생 생성");
		this.name = name;
		this.major = major;
		this.no = no;
		this.age = age;
	}

	// 3.메서드(기능,행동)
	void study() {
		System.out.println(name + "공부 중");
	}

	String getMajor() {
		return name + "의 전공은 " + major;
	}

	int getAge() {
		return age;
	}
	
	void printStudent() {
		System.out.println("이름: " + name);
		System.out.println("전공: " + major);
		System.out.println("학번: " + no);
		System.out.println("나이: " + age);
	}
}
