package com.kosta.day17.test;

import java.util.Arrays;

public class Prob2_강사님 {
	public static void main(String[] args) {
		System.out.println(leftPad("Samsung",10,'#'));
		System.out.println(leftPad("SDS",5,'*'));
		System.out.println(leftPad("Multicampus",5,'@'));

	}

	public static String leftPad(String str, int size, char fillChar){
		try {
			if (str.length() > size) throw new IllegalSizeException("문자열의 길이보다 size가 큽니다.");
		} catch (IllegalSizeException e) {
			System.out.println(e.getMessage());
			return "";
		}

		int diff = size - str.length();
		String message = "";
//		방법1
//		for(int i = 0; i < diff; i++) {
//			message += fillChar;
//		}
//		return message + str;

//		방법2
		String[] arr = new String[diff];
		Arrays.fill(arr, fillChar+"");
		return Arrays.toString(arr).replaceAll("\\[|,| |]", "") + str;
	}
}

//구현하시오.
class IllegalSizeException extends RuntimeException {
	 IllegalSizeException(String message) {
	 	super(message);
	 }
}



