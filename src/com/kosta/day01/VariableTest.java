package com.kosta.day01;

public class VariableTest {

	static int speed;
	static double speed2;

	// main이 없으면 실행 불가
	public static void main(String[] args) {

		System.out.println("speed=" + speed);
		System.out.println("speed2=" + speed2);

		System.out.println("변수는");
		System.out.println("기억장소의 이름이다");

		// 10 저

		// 1. 변수 선언
		int a;

		// 2. 변수에 값을 할당
		a = 10;

		// 3. 값을 읽어 출력
		System.out.println(a);
		System.out.println(a + 20);

		// 선언+할당
		int score = 100;
		score = score + 10; // 대입연산자
		score += 10; // 복합대입연산자

		// 문자 + 숫자 => 문자 (연결연산자)
		System.out.println("점수는" + score);

		// local variable(지역변수)는 반드시 초기화를 하여야 사용 가능
		int value = 0;
		int result = value + 10;
		System.out.println(result);
	}
}