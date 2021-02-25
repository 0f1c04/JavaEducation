package com.kosta.day09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest3 {
    public static void main(String[] args) {
        try {
            method2();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("main end");
    }
    private static void method2() throws IOException {
        //예외처리
        //2) throws
        FileReader fr = null;
        fr = new FileReader("src/com/kosta/day09/Button.java");
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char)i);
        }
        fr.close();
        System.out.println("Exception end");
    }

    private static void method1() {
        //예외처리
        //1) try catch finally
        FileReader fr = null;
        try {
            fr = new FileReader("src/com/kosta/day09/Button.java");
            System.out.println("파일열기성공");
            //파일 읽어서 출력
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char)i);
            }
            System.out.println("try-catch end");
        } catch (FileNotFoundException e) {
            System.out.println("파일이 존재하지 않는다.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fr != null) fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
