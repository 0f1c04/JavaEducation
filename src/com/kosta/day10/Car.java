package com.kosta.day10;

public class Car implements Comparable<Car>{

	private String model;
	private int price;

	public Car() {
	}

	public Car(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [model=").append(model).append(", price=").append(price).append("]");
		return builder.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Car가 소멸됩니다.");
		super.finalize();
	}

	@Override
	public int compareTo(Car obj) {
		//모델로 비교, 모델이 같으면 price로 비교
		int aa = model.compareTo(obj.model);
		if(aa==0) {
			return price - obj.price;
		}
		return aa;
	}

	
	
	
}
