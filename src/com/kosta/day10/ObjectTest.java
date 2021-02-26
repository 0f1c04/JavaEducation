package com.kosta.day10;

import java.util.Arrays;
import java.util.Objects;

public class ObjectTest {

	public static void main(String[] args) {
		sample9();
	}

	private static void sample9() {
		Book[] bookList = new Book[5];
		
		bookList[0] = new Book("java", 25000, false);
		bookList[1] = new Book("sql", 20000, true);
		bookList[2] = new Book("html", 30000, false);
		bookList[3] = new Book("javascript", 22000, false);
		bookList[4] = new Book("javascript", 31000, true);
		
		Arrays.sort(bookList); //가격으로 Ascending
		Arrays.sort(bookList, new BookDescendingComparator()); //제목으로 descending, 제목이 같다면 가격으로 ascending
		
		for(Book b : bookList) {
			System.out.println(b);
		}
		
	}

	private static void sample8() {
		Car[] carList = new Car[3];
		carList[0] = new Car("A", 2000);
		carList[1] = new Car("A", 3000);
		carList[2] = new Car("B", 1000);
		
		Arrays.sort(carList);
		System.out.println("Asending sort : " + Arrays.toString(carList));
		
		Arrays.sort(carList, new CarDescending());
		System.out.println("desending sort : " + Arrays.toString(carList));
	}

	private static void sample7() {
		//Integer class = int 기본형 + 기능추가
		
		Integer[] arr = {1, 23, 3, 14, 5};
		Arrays.sort(arr);
		System.out.println("asending sort : " + Arrays.toString(arr));
		Arrays.sort(arr, new IntegerDescending());
		System.out.println("desending sort : " + Arrays.toString(arr));
	}

	private static void sample6() {
		int[] arr = {1, 23, 3, 14, 5};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//sort를 이용하기 위해 implements comparable을 통해 이뤄져야한다.
		Car[] carList = new Car[3];
		carList[0] = new Car("A", 2000);
		carList[1] = new Car("A", 3000);
		carList[2] = new Car("B", 1000);
		
		Arrays.sort(carList);
		System.out.println(Arrays.toString(carList));
	}

	private static void sample4() {
		Car car1 = new Car("model", 1300);
		Car car2 = new Car("model", 1300);
		
		int result = car1.compareTo(car2);
		if(result!=0) {
			System.out.println(result > 0?"car1이크다" : "car2가 크다");
		}else {
			System.out.println("같다");
		}
		
	}

	private static void sample2() {
		String s1 = "자바";
		String s2 = "자바1";
		// < = > 
		System.out.println(s2.compareTo(s1));
		
		Object s3 = new Object();
		Object s4 = new Object();
		System.out.println(Objects.compare(s3, s4, null));
	}

	private static void sample1() {
		Car car1 = new Car("model", 1000);
		System.out.println(car1);
		
		car1 = null;
		System.gc(); //garbage collector 수행
		System.out.println(car1);
	}

}
