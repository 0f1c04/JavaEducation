package com.kosta.day01;

public class VariableTest3 {

	public static void main(String[] args) {
		byte a = 127; // -128~127
		System.out.println(a);

		short b = 32767; // -32768~32767
		System.out.println(b);

		char c = 'A'; // 0~65535
		System.out.println(c);

		int d = 2147483647; // -2147483648~2147483647
		d++;
		System.out.println(d);
	}

}
