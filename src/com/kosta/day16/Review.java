package com.kosta.day16;

import java.io.*;

public class Review {
    public static void main(String[] args) {
        fileCopy();
    }

    private static void fileCopy() {
        // \t: tab      \n: new line     \\: \문자
        // 폴더이름구분시 /, \\ 모두 가능
        String originalFile = "src/com/kosta/day15/Student.java";
        String targetFile = "src/com/kosta/day15/Student.txt";

        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        String line = null;

        try {
            fr = new FileReader(originalFile);
            br = new BufferedReader(fr);
            fw = new FileWriter(targetFile);
            bw = new BufferedWriter(fw);

            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
                if (fr != null) fr.close();
                if (bw != null) bw.close();
                if (fw != null) fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
