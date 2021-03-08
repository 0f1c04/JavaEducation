package com.kosta.day15.IO;

import com.kosta.day15.Student;

import java.io.*;
import java.util.stream.Stream;

public class IOTest2 {
    public static void main(String[] args) {
        method3();
    }


    private static void method3() {
        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;

        int data;
        String s = null;

        String fname = "src/com/kosta/day15/Review.java";
        String fname2 = "Review_backup.txt";

        try {
            fr = new FileReader(fname);
            br = new BufferedReader(fr);
            fw = new FileWriter(fname2);
            bw = new BufferedWriter(fw);

            Stream<String> lines = br.lines();
            lines.forEach(System.out::println);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            lines = br.lines();
            lines.forEach(aa -> {
                System.out.println(aa);
            });

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) fr.close();
                if (fw != null) fw.close();
                if (br != null) br.close();
                if (bw != null) bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void method2() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fos = new FileOutputStream("objecttype.text");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(new Student("kim", 100));
            oos.writeObject(new Student("bae", 300));
            oos.writeObject(new Student("lim", 200));
            oos.close();
            fos.close();

            fis = new FileInputStream("objecttype.data");
            Object s;
            while(true) {
                s = ois.readObject();
                if(s==null) break;
                System.out.println(s);
            }
            ois.close();
            fis.close();
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void method1() {
        //자바기본형 파일 저장: byte, short, char, int, long, float, double, boolean
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        FileInputStream fis = null;
        DataInputStream dis = null;

        try {
            fos = new FileOutputStream("basictype.txt");
            dos = new DataOutputStream(fos);
            dos.writeInt(100);
            dos.writeBoolean(10>20);
            dos.writeDouble(3.14);

            dos.close();
            fos.close();

            fis = new FileInputStream("basictype.txt");
            dis = new DataInputStream(fis);
            System.out.println(dis.readInt() + 200);
            System.out.println(dis.readBoolean()?"참":"거짓");
            System.out.println(dis.readDouble() + 100);

            dis.close();
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
