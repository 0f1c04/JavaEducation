package com.kosta.day10;

import java.util.Comparator;

public class CarDescending implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		int result = o1.getModel().compareTo(o2.getModel())*-1;
		if(result==0) return (o1.getPrice()-o2.getPrice())*-1;
		return result;
	}
	
}
