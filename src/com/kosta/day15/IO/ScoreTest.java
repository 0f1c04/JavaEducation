package com.kosta.day15.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ScoreTest {
    public static void main(String[] args) throws IOException {
        String fname = "src/com/kosta/day15/IO/data.txt";
        printScore(fname);
    }

    private static void printScore(String fileName) throws IOException {
        FileReader fr = null;
        BufferedReader br = null;
        fr = new FileReader(fileName);
        br = new BufferedReader(fr);

        String line = br.readLine();
        System.out.println(line.replace("/", "\t") + "\t총점");

        while ((line = br.readLine()) != null) {
            System.out.print(line.replace("/", "\t"));
            String[] arr = line.split("/");
            int sum = 0;
            for(int i = 1; i < arr.length; i++) {
                sum += Integer.parseInt(arr[i]);
            }
            System.out.print("\t" + sum);

            //stream 사용
            Stream<String> stream = Arrays.stream(arr, 1, arr.length);
            //ToIntFunction<String> f2 = aa->Integer.parseInt(aa);
            ToIntFunction<String> f2 = Integer::parseInt;
            IntStream is = stream.mapToInt(f2);
            int result = is.sum();
            System.out.println("\t" + result);
        }
        br.close();
        fr.close();
    }
}
