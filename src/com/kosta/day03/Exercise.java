package com.kosta.day03;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		// quiz6();
		// quiz7();
		// quiz8();
		quiz9();
	}

	private static void quiz9() {
		// 키보드로부터 학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = sc.nextInt();
			} else if (selectNo == 2) {
				scores = new int[studentNum];
				for (int i = 0; i < studentNum; i++) {
					System.out.print("scores[" + i + "]: ");
					scores[i] = sc.nextInt();
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores[" + i + "]:" + scores[i]);
				}
			} else if (selectNo == 4) {
				int sum = 0, count = 0, max = 0;
				double avg = 0.0;
				for (int i = 0; i < studentNum; i++) {
					sum += scores[i];
					count++;
					if (max < scores[i]) max = scores[i];
				}
				avg = (double) sum / count;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		sc.close();
		System.out.println("프로그램 종료");
	}

	private static void quiz8() {
		// 주어진 배열의 전체 항목의 합과 평균값을 구하라
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		int sum = 0;
		double avg = 0.0;

		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		avg = (double) sum / count;

		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}

	private static void quiz7() {
		// 주어진 배열의 항목에서 최대값을 구하라
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}

		System.out.println("max : " + max);
	}

	private static void quiz6() {
		// array.length 값과 array[2].length값을 구하라
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		System.out.println(array.length + " " + array[2].length);
	}
}
