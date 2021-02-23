package com.kosta.day07;

public class 다형성연습2 {
    public static void main(String[] args) {
        //기본형의 자동형변환: 큰방 = 작은값
        long lo;
        int i = 100;
        lo = i;

        //자동형변환: 부모 = 자식
        Tire hankookTire = new HankookTire();
        Tire gumhoTire = new GumhoTire();

        use(hankookTire);
        use(gumhoTire);
        use(new HankookTire());
        use(new GumhoTire());
    }

    public static void use(Tire tire) {
        System.out.println(tire);
        System.out.println("------------------");
    }
}
