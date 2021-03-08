package com.kosta.day15.IO;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class IOTest {

    public static void main(String[] args) throws IOException {
        method9();
    }

    private static void method9() throws IOException {
        String name = "src/com/kosta/day15/Review.java";
        File f = new File(name);
        System.out.println(f.exists());
        System.out.println(f.length());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.lastModified());

        Date d = new Date(f.lastModified());
        System.out.println(d);

        //디렉토리만들기(폴더)
        String fname = "src/aa";
        File f2 = new File(fname);
        boolean b = f2.mkdir();
        System.out.println(b);

        fname = "src/aa/text.txt";
        f2 = new File(fname);
        b = f2.createNewFile();
        System.out.println(b);
    }

    private static void method8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력>>");
        String s = sc.next();
        int i = sc.nextInt();
        sc.close();
    }

    private static void method7() throws IOException {
        System.setIn(new FileInputStream("src/com/kosta/day15/Review.java"));
        InputStream is = System.in; //표준입력(기본이 키보드)
        int i;
        while((i = is.read()) != -1) {
            System.out.print((char) i);
        }
    }

    private static void method6() throws FileNotFoundException {
        System.setOut(new PrintStream("output.txt"));
        PrintStream out = System.out; //표준 출력
        //PrintStream out = System.err;
        out.println("자바");
    }

    private static void method5() {
        InputStream is = System.in;
        InputStreamReader ir = new InputStreamReader(is);
        try {
            int i = ir.read();
            System.out.println((char)i);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void method1() {
        FileInputStream fi = null;
        int data;
        try {
            fi = new FileInputStream("src/com/kosta/day15/IO/java.png");
            try {
                while((data = fi.read())!=-1) { //ascii code로 읽음
                    System.out.print((char)data);
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println((int)'1');
        } catch (FileNotFoundException e) {
            System.out.println("파일이 존재하지 않습니다.");
        } finally {
            try {
                if(fi != null) fi.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}