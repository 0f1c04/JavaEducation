package com.kosta.day10;

import java.util.Comparator;

//기본형은 comparator 제너릭 안에 들어 갈 수 없다
public class IntegerDescending implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return (o1-o2)*-1;
	}
	
}
