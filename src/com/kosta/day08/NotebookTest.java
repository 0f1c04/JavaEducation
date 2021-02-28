package com.kosta.day08;

public class NotebookTest {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook();
        notebook1.test();

        Volume notebook2 = new Notebook();
        System.out.println(notebook2.TITLE); //잘못된 사용
        System.out.println(Volume.TITLE);

        notebook2.volumeUp(100);
        notebook2.volumeDown(20);
        ((Notebook) notebook2).test();

        method1(notebook1);
        method1(notebook2);
        method1(new Speaker());
    }

    private static void method1(Volume volume) {
        volume.volumeUp(100);
        volume.volumeDown(20);
        if (volume instanceof Notebook)
            ((Notebook) volume).test();
        System.out.println(Volume.TITLE);

        volume.close();
        Volume.volumeInfo(); //interface의 static method
    }
}
