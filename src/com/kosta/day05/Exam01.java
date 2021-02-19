package com.kosta.day05;

public class Exam01 {
    public static void main(String[] args) {
        Staff[] arr = new Staff[4];
        arr[0] = new Staff("이부장", "부장", 1500000);
        arr[1] = new Staff("김과장", "과장", 1300000);
        arr[2] = new Staff("최대리", "대리", 1200000);
        arr[3] = new Staff("박사원", "사원", 1000000);

        for(Staff stf : arr) {
            stf.print();
        }
    }
}
