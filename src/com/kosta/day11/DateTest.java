package com.kosta.day11;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTest {
    public static void main(String[] args) {
        method7();
    }

    private static void method7() {
        LocalDate d = LocalDate.now();
        LocalDateTime d2 = LocalDateTime.now();
        LocalDate d3 = d.minusDays(7);
        System.out.println(d);
        System.out.println("일주일 전: " + d3);
    }

    private static void method6() {
        String s = "자동차의 모델은 {0}, 가격은 {1}";
        Car car = new Car("모델A", 2000);
        String[] obj = {car.getModel(), car.getPrice() + ""};
        System.out.println(MessageFormat.format(s, obj));
    }

    private static void method5() {
        String s = "id: {0} phone: {1}";
        System.out.println(MessageFormat.format(s, "f1c04", "010-1234-5678"));
    }

    private static void method4() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        System.out.println(sdf.format(d));
    }

    private static void method3() {
        int num = 10000000;
        DecimalFormat df = new DecimalFormat("###,###,###");
        System.out.println(df.format(num));
    }

    private static void method2() {
        Calendar cal = Calendar.getInstance();
        TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar cal2 = Calendar.getInstance(tz);

        System.out.println(cal);
        System.out.println(cal2);

        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH + 1));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH + 1));
        System.out.println((cal.get(Calendar.AM_PM) == 0) ? "오전" : "오후");
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));

        System.out.println(cal2.get(Calendar.YEAR));
        System.out.println(cal2.get(Calendar.MONTH + 1));
        System.out.println(cal2.get(Calendar.DAY_OF_MONTH + 1));
        System.out.println(cal2.get(Calendar.AM_PM));
        System.out.println(cal2.get(Calendar.HOUR));
        System.out.println(cal2.get(Calendar.MINUTE));
        System.out.println(cal2.get(Calendar.SECOND));
    }

    private static void method1() {
        Date d = new Date();
        System.out.println(d.toLocaleString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
        System.out.println(sdf.format(d));

        java.sql.Date d2 = new java.sql.Date(d.getTime());
        System.out.println(d2);
    }
}
