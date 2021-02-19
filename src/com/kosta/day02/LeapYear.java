package com.kosta.day02;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// 년, 월에 따른 월의 말일 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("년 월을 입력하시오(ex:2000 2) >>");
		int year = sc.nextInt();
		int month = sc.nextInt();
		sc.close();

		// 4의 배수이고 100의 배수가 아니면 윤년
		// 100의 배수이면서 400의 배수인 해는 윤년
		// 윤년이면 2월은 29일까지, 아니면 28일까지
		// 1, 3, 5, 7, 8, 10, 12 -> 31
		// 4, 6, 11 -> 30

		ifTest(year, month);
		switchTest(year, month);

	}

	private static void switchTest(int year, int month) {
		int day = 31;
		switch (month) {
		case 2:
			if (year % 4 == 0 && year % 100 != 0 || year % 4 == 0 && year % 400 == 0) { // ||보다 &&가 우선순위가 먼저임
				day = 29;
			} else {
				day = 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
		}
		System.out.println(year + "년 " + month + "월의 말일은 " + day + "일입니다.");
	}

	private static void ifTest(int year, int month) {
		int day = 31;

		if (month == 2) {
			if (year % 4 == 0) {
				if (year % 100 == 0 && year % 400 != 0) {
					day = 28;
				}else {
					day = 29;
				}
			} else {
				day = 28;
			}
		} else if (month == 4 || month == 6 || month == 11) {
			day = 30;
		}
		System.out.println(year + "년 " + month + "월의 말일은 " + day + "일입니다.");
	}
}
