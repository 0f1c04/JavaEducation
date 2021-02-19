package com.kosta.day02;

public class IfTest {

	public static void main(String[] args) {
		// randomTest();
		ifDiceExample();
	}

	private static void ifDiceExample() {
		int num = (int) (Math.random() * 6) + 1;

		// 홀짝 구분
		String result;
		if (num % 2 == 1) {
			result = "홀수입니다.";
		} else {
			result = "짝수입니다.";
		}
		System.out.println(num + " " + result);

		// 3항 연산자
		System.out.println(num + " " + (num % 2 == 1 ? "홀수입니다." : "짝수입니다."));
	}

	private static void randomTest() {
		// Math Class : 자바에서 제공하는 수학공식에 필요한 기능들을 모아놓은 클래스
		System.out.println(Math.PI);
		System.out.println(Math.random()); // 0 <= random() < 1

		System.out.println((int) (Math.random() * 10)); // 0 <= random() < 10
		System.out.println((int) (Math.random() * 10 + 1)); // 1 <= random() <= 10

		System.out.println((int) (Math.random() * 45 + 1)); // 로또
	}

}
