package com.kosta.day01;

public class VariableTest4 {

	public static void main(String[] args) {
		// 자바의 기본 Data Type

		// 1.정수(byte(1)<short(2)=char(2)<int(4)<long(8)
		byte b = 127;
		short s = 32767;
		char c = 65535;
		int i = 2147483647;
		long lo = 2147483648L; // 정수의 기본 리터럴이 int형이므로 뒤에 L을 붙여야 lon형으로 선언

		// 2.실수(float(4)<double(8))
		float f = 3.14f; // 실수의 기본 리터럴이 double형이므로 뒤에 f을 붙여야 float형으로 선언
		double d = 3.14;

		// 3.논리(boolean)
		boolean bo = 10 > 20; // true or false

		// 데이터의 형변환 (자동,강제)
		// 1.자동(묵시적) 변환대상이 변환하려는 데이터형보다 큰 경우 가능
		byte aa = 127;
		int ii = aa;
		System.out.println(ii);

		// 2.강제(명시적) 변환대상이 변환하려는 데이터형보다 작을 경우 명시적으로 강제 형변환
		byte b2 = 100;
		int i2 = 200;
		b2 = (byte) i2;
		System.out.println(b2); // 범위를 벗어난다면 값이 손실된다.

	}

}
