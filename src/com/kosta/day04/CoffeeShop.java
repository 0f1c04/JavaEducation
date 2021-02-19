package com.kosta.day04;

public class CoffeeShop {

	public static void main(String[] args) {
		System.out.println(Coffee.getCount2());
		
		Coffee order1 = new Coffee("아메리카노", 2000);
		Coffee order2 = new Coffee("카페라떼", 3000);
		Coffee order3 = new Coffee("오늘의커피");
		
		order1.print();
		order2.print();
		
		System.out.println(order1.getCount() + "개 주문됨");
		
		int count = Coffee.getCount2();
		System.out.println(count);
	}

}
