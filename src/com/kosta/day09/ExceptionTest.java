package com.kosta.day09;

public class ExceptionTest {
    public static void main(String[] args) {
        method8();
        System.out.println("main END");
    }

    private static void method8() {
        try {
            int a = 10 / 0;
            int[] arr = new int[5];
            arr[5] = 100;
            String s = null;
            System.out.println(s.length());
            Object obj = new String("자바");
            Integer i = (Integer) obj;
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없음");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 범위를 벗어난 접근");
        } catch (NullPointerException e) {
            System.out.println("null 참조불가능");
        } catch (ClassCastException e) {
            System.out.println("형변환 오류");
        } catch (Exception e) {
            //상위 예외처리는 마지막에 기술한다.
            System.out.println("기타 오류: " + e.getMessage());
        } finally {
            System.out.println("반드시 수행");
        }
    }

    private static void method7() {
        //예외발생
        //1) 내가한다: try~catch~finally
        //2) 떠넘긴다.
        try {
            System.out.println("예외발생 가능성있는 코드");
            int a = 10 / 0;
            System.out.println("이문장은 수행안함");
        } catch (Exception e) {
            //ArithmeticException -> RuntimeException -> Exception
            System.out.println("예외발생시 수행함");
            System.out.println(e.getMessage());
        } finally { //자원반납코드를 많이 작성: DB닫기, 파일닫기
            System.out.println("항상 수행");
        }
    }

    private static void method6() {
        String s = new String("자바");
        Object s2 = new String("자바"); //자동 형변환
        try {
            String s3 = (String) s2; //강제 형변환
            Integer i = (Integer) s2;
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void method5() {
        try {
            int[] arr = new int[5];
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("arr 범위를 벗어난 접근입니다.");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private static void method4() {
        try {
            String s = "자바";
            System.out.println(s.length());
            s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("null은 참조불가");
        }
    }

    private static void method3() {
        //Exception 종류: 컴파일 체크, 실행예외(Runtime Exception)
        try {
            Class.forName("aacom.kosta.day09.Button");
            System.out.println("class load success");
        } catch (Exception e) {
            System.out.println("class load fail");
            e.printStackTrace();
        }
    }

    private static void method2() {
        int a = 10;
        int b = 0;
        try {
            //예외발생 가능성 있는 코
            System.out.println(a / b);
        } catch (ArithmeticException aa) {
            System.out.println("0으로 나누기 불가능");
        }
    }

    //오류가 발생하지 않도록 업무로직 중간에 값을 체크
    //업무로직 + 오류처리로직 섞으면 좋은 코드
    //Exception 사용: 업무로직, 오류처리로직을 분리한다. 오류발생 시 프로그램이 비정상적으로 종료 되지 않게하기 위해
    private static void method1() {
        int a = 10;
        int b = 0;

//        if(b==0) {
//            System.out.println("나누는 수는 0이 될 수 없습니다.");
//            return;
//        }
        System.out.println(a / b);
    }
}
