package com.kosta.day03;

public class EnumTest2 {

    public static void main(String[] args) {
        Week w;
        w = Week.SUNDAY;
        System.out.println(w);
        System.out.println(w == Week.SUNDAY);
        System.out.println(w.ordinal());
        System.out.println(w.name());
        System.out.println(w.name().equals("SUNDAY"));

        String s = w.name();
        Week ww = Week.valueOf("SUNDAY");
        Week ww2 = Week.valueOf("MONDAY");

        System.out.println("---------------------");
        System.out.println(ww.compareTo(ww2));

        Week[] arr = Week.values();
        for (Week i : arr) {
            System.out.print(i.ordinal() + " ");
            System.out.print(i.name() + " ");
        }
    }

}
