package com.kosta.day04;

import java.io.InputStream;
import java.util.Scanner;

public class ClassTest {
	public static void main(String[] args) {
		//1.객체참조변수선언
		String s1, s2, s3, s4;
		
		//2.객체생성
		s1 = new String();
		s2 = new String("자바");
		
		byte[] b = new byte[] {65, 66, 67};
		s3 = new String(b);
		
		char[] c = new char[] {'A', 'B', 'C', 'D'};
		s4 = new String(c);
		
		//4.객체사용
		System.out.println("*" + s1 + "*");
		System.out.println("*" + s2 + "*");
		System.out.println("*" + s3 + "*");
		System.out.println("*" + s4 + "*");
		
		//Scanner 클래스 살펴보기
		InputStream aa = System.in; //표준입력얻기
		//aa.read(); //1바이트씩 얻기
		Scanner sc = new Scanner(aa);
		System.out.println(sc.nextLine());
	}
}
