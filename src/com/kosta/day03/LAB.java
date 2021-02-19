package com.kosta.day03;

import java.util.Arrays;

public class LAB {

	public static void main(String[] args) {
		//printSeason(args[0]);
		//printSeason2(args[0]);
		//abs(args[0], args[1]);
		sort();
	}

	private static void sort() {
		int[] arr = new int[] {3, 24, 1, 55, 17, 43, 5};
		System.out.println(Arrays.toString(arr));
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;	
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void abs(String s1, String s2) {
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		
		int result = num1 > num2 ? num1 - num2 : num2 - num1;
		System.out.println(result);
	}

	private static void printSeason2(String month) {
		String spring = "봄", summer = "여름", fall = "가을", winter="겨울";
		String[] result = {"-1", winter, winter, spring, spring, spring, summer, summer, summer, fall, fall, fall, winter};
		int mon = Integer.parseInt(month);
		if(mon == 0 || mon >= result.length) 
			System.out.println("1~12 숫자를 입력하시오.");
		else 
			System.out.println(result[mon] + "태어남");
	}

	private static void printSeason(String month) {
		/*
		 자신이 태어난 달을 명령행 매개변수로 받아서 어떤 계절에 태어났는지 출력하는 printSeason() 메서드를 구현하시오.
		 (봄 : 3,4,5		여름 : 6, 7, 8	 가을 : 9, 10, 1 		겨울 : 12, 1, 2)
		 */
		System.out.println(month);
		String result;
		switch(month) {
		case "3":
		case "4":
		case "5": result = ""; break;
		case "6":
		case "7":
		case "8": result = "여름"; break;
		case "9":
		case "10":
		case "11": 
		case "12": result = "가을"; break;
		case "1":
		case "2":
		default: result = "1~12 숫자를 입력하시오."; return;
		}
		System.out.println(result);
	}

}
