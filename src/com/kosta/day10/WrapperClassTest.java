package com.kosta.day10;

/* WrapperClass = 기본형 + 기능추가
 * 기본형 : 값 저장, 연산, 비교
 * 1. byte	-> Byte
 * 2. short	-> Short
 * 3. char	-> Character
 * 4. int	-> Integer
 * 5. long	-> Long
 * 6. float	-> Float
 * 7. double-> Double
 */
public class WrapperClassTest {

    public static void main(String[] args) {
        method2();
    }

    private static void method2() {
        char c1 = 'a'; //97 -> 65
        System.out.print("대문자 출력 : ");
        System.out.println((char) (c1 - 32));

        Character c2 = 'a';
        System.out.println(c2.toUpperCase(c2));

        System.out.println(Character.isAlphabetic(c2));
        System.out.println(Character.isAlphabetic('1'));

        System.out.println(Character.isDigit('1'));
    }

    private static void method1() {
        int a = 10;
        Integer b = new Integer(20);
        Integer c = 30; //AutoBoxing된다. new Integer(30)

        System.out.println(c.floatValue());
        System.out.println(c.intValue());

    }

}
