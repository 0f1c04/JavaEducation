package com.kosta.day17.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class FileController {
    public static void main(String[] args) throws Exception {
        String fname = "input.txt";
        reverseLine(fname, "output.txt");
    }

    static void reverseLine(String inputFileName, String outputFileName) throws Exception {
        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;

        //읽기
        fr = new FileReader(inputFileName);
        br = new BufferedReader(fr);
        String str;
        ArrayList<String> line = new ArrayList<>();
        //line list에 add
        while ((str = br.readLine()) != null) {
            line.add(str);
        }
        //line 뒤집기
        Collections.reverse(line);

        //쓰기
        fw = new FileWriter(outputFileName);
        bw = new BufferedWriter(fw);

        //뒤집힌 line list를 write, 개행추가
        for (int i = 0; i < line.size(); i++) {
            bw.write(line.get(i));
            bw.newLine();
        }
        br.close();
        bw.close();
        fr.close();
        fw.close();

    }
}
