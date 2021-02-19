package com.kosta.day04;

public class NoteBookTest {

	public static void main(String[] args) {
		String s = new String("java");
		System.out.println(s+"\n");
		
		System.out.println(NoteBook.getCount() + "대 있음...메소드 접근");
		
		//private는 외부접근불가
		//System.out.println(NoteBook.count + "대 있음...field 접근");
		
		NoteBook n1 = new NoteBook("ABC12345", "GRAM", 150);
		NoteBook n2 = new NoteBook("12345678", "MAC", 150);
		NoteBook n3 = new NoteBook("ERT12345", "THINKPAD", 150);
		System.out.println(NoteBook.getCount() + "대 있음...메소드 접근");
		
		System.out.println(n1.getMacAddress());
		n1.setMacAddress("LOVE1234");
		System.out.println(n1.getMacAddress());
		
		System.out.println(n1);
		System.out.println(n1.toString());
	}

}
