package com.kosta.day03;

import java.util.Arrays;

public class 다차원배열 {

	public static void main(String[] args) {
		// method1();
		// method2();
//		method3();
//		method4();
//		method5();
		method7();
		
	}

	private static void method7() {
		int a = 100;
		System.out.println("before: " + a);
		method8(a);
		System.out.println("after: " + a);
	}

	private static void method8(int a) {
		a = 300;
	}

	private static void method5() {
		int[] arr1 = new int[] { 100, 99, 70, 88, 95 };
		System.out.println(Arrays.toString(arr1));
		method6(arr1);
		System.out.println(Arrays.toString(arr1));
	}

	private static void method6(int[] scores) {
		scores[0] = 300;
		System.out.println(Arrays.toString(scores));
	}

	private static void method4() {
		// 배열복사
		int[] arr1 = new int[] { 100, 99, 70, 88, 95 };

		// 1. for 사용
		int[] arr2 = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		arr1[0] = 200;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		// 2. System.arraycopy 사용
		int[] arr3 = new int[arr1.length];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr3));
		
		// 3. Arrays 클래스 사용
		int[] arr4 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr4));
	}

	private static void method3() {
		String[][] arr = new String[][] { { "JAVA", "SQL", "WEB" }, { "HTML", "CSS3" }, { "A", "B", "C", "D" } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		// 주소를 넣는다. 같은 주소를 참조한다.
		String[][] arr2 = arr;
		arr2[0][0] = "자바";
		System.out.println(arr2[0][0]);
		System.out.println(arr[0][0]);
	}

	private static void method2() {
		String[][] arr = new String[3][]; // 앞 배열개수는 필

		for (int i = 0; i < arr.length; i++) {
			// System.out.println(arr[i]);
			arr[i] = new String[i + 4];
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void method1() {
		int[][] arr;
		int arr2[][];
		int[] arr3[]; // 잘안

		arr = new int[2][3];
		arr2 = new int[2][];
		arr2[0] = new int[3];
		arr2[1] = new int[4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
