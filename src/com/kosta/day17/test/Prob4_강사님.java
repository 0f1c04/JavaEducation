package com.kosta.day17.test;

import java.io.*;
import java.util.HashSet;

public class Prob4_강사님 {
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
        HashSet hs = new HashSet();
        for (Product p : prodList) {
            if (p.getPrice() >= price) {
                System.out.println(p);
                hs.add(p);
            }
        }
        return hs;
    }


    private static void makeFile(HashSet resultList) {
        String fname = "resultList.dat";
        FileOutputStream fos = null;
		ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(fname);
			oos = new ObjectOutputStream(fos);
			for(Object obj:resultList) {
                oos.writeObject(obj);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
			e.printStackTrace();
		} finally {
            try {
                if (fos != null) fos.close();
                if (oos != null) oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void readFile() {
        String fname = "resultList.dat";
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(fname);
            ois = new ObjectInputStream(fis);
            while(true) {
                Object obj = ois.readObject();
                if(obj == null) break;
                System.out.println(obj);
            }
        } catch (EOFException e) {

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) fis.close();
                if (ois != null) ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}


class Product implements Serializable {
    private String model_name;
    private int price;
    private String company;


    public Product(String model_name, int price, String company) {
        super();
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
        return "Product [model_name=" + model_name + ", price=" + price
                + ", company=" + company + "]";
    }


}