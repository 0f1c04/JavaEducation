package com.kosta.day02;

import java.util.Scanner;

public class LAB {

	public static void main(String[] args) {
		// sumTest();
		// hokeyGraphics('*', 3, false);
		// inverseTriangle();
		// printPrime();
		// factorialTest();
	}

	private static void factorialTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. : ");
		int num = sc.nextInt();
		sc.close();
		
		if(num > 10) {
			System.out.println("10보다 작은 수를 입력하세요.");
			return;
		}
		
		int result = 1;
		for(int i = 1; i <= num; i++) {
			result *= i;
		}
		System.out.println(num + " != " + result);
	}

	private static void printPrime() {
		System.out.print(2 + " ");
		AA:for (int i = 3; i < 50; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) continue AA;
			}
			System.out.print(i + " ");
		}
	}

	private static void inverseTriangle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("직각 역삼각형을 출력할 줄 수: ");
		int num = sc.nextInt();
		sc.close();

		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num + 1 - row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void hokeyGraphics(char cell, int size, boolean isRect) {
		if (isRect) {
			for (int row = 0; row < size; row++) {
				for (int col = 0; col < size; col++) {
					System.out.print(cell);
				}
				System.out.println(); // 개행
			}
		} else {
			for (int row = 1; row <= size; row++) {
				for (int col = 1; col <= row; col++) {
					System.out.print(cell);
				}
				System.out.println(); // 개행
			}
		}
	}

	private static void sumTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오: ");
		int num = sc.nextInt();
		sc.close();

		int start = 1;
		int sum = 0;

		if (num % 2 == 0) {
			start = 0;
		}
		for (int i = start; i <= num; i += 2) {
			sum += i;
		}
		System.out.println("결과 값 : " + sum);
	}

}
