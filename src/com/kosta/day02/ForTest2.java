package com.kosta.day02;

public class ForTest2 {

	public static void main(String[] args) {

		test2();
		System.out.println("========================");

		AA: for (int i = 2; i <= 9; i++) {
			System.out.println(i + "-----------");
			// if(i == 4) break;
			for (int j = 1; j <= 9; j++) {
				// if(i == 4) break;
				if (i == 4)
					break AA;
				System.out.println(i + "*" + j);
			}
		}
		System.out.println("For End");
	}

	private static void test2() {
		for (int j = 1; j <= 3; j++) {
			for (int i = 1; i <= 10; i++) {
				if (i == 3) {
					continue; // 아래문장들을 무시하고 반복문은 계속 수행
				}
				System.out.println(i);
			}
		}
	}

}
