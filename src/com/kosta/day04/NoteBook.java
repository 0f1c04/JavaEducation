package com.kosta.day04;
/* Access modifier
 * 1)public: 모든 패키지에서 접근가능
 * 2)protected
 * 3)default: 같은 패키지만 접근가능
 * 4)private : 같은class내에서만 접근 가능 (정보은닉)
 */
public class NoteBook extends Object{
	//member variable: instance variable, class variable
	private String macAddress;
	public String model;
	int price;
	private static int count;
	
	//constructor method
	public NoteBook(String macAddress, String model, int price) {
		super();
		this.macAddress = macAddress;
		this.model = model;
		this.price = price;
		count++;
	}	
	
	//instance method
	public String getMacAddress() {
		return macAddress.substring(0, 3) + "*****";
	}
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
	
	//class method
	public static int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "NoteBook [macAddress=" + macAddress + ", model=" + model + ", price=" + price + "]";
	}
	
}
