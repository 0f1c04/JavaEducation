package com.kosta.day16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;

public class Prob4 {
    public static void main(String[] args) {
        Product[] prodList = {
                new Product("NT450R5E-K24S", 500000, "삼성전자"),
                new Product("15UD340-LX2CK", 400000, "LG전자"),
                new Product("G2-K3T32AV", 600000, "HP")};
        HashSet product_hs = makeHashSet(prodList, 500000);
        makeFile(product_hs);
        readFile();
    }

    private static HashSet makeHashSet(Product[] prodList, int price) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < prodList.length; i++) {
            if (prodList[i].getPrice() >= price) {
				hashSet.add(prodList[i]);
			}
        }
        System.out.println("*특정 금액 이상의 상품 결과입니다.***********************");
        System.out.println(hashSet);

        return hashSet;
    }

    private static void makeFile(HashSet resultList) {
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("data.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            objectOutputStream.writeObject(resultList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile() {
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("data.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        HashSet hashSet = null;
        try {
            hashSet = (HashSet) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("*readFile결과입니다.***********************");
        System.out.println(hashSet);
    }
}

class Product implements Serializable {
    private String model_name;
    private int price;
    private String company;

    public Product(String model_name, int price, String company) {
        this.model_name = model_name;
        this.price = price;
        this.company = company;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Product [");
		sb.append("model_name='").append(model_name).append('\'');
		sb.append(", price=").append(price);
		sb.append(", company='").append(company).append('\'');
		sb.append("]");
		return sb.toString();
	}
}