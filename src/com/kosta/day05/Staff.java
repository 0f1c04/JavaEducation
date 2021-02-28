package com.kosta.day05;

public class Staff {
    private String name;
    private String title;
    private int baseSalary;
    private int totalSalary;

    public Staff(String name, String title, int baseSalary) {
        this.name = name;
        this.title = title;
        this.baseSalary = baseSalary;
        getTotalSalary();
    }

    public void getTotalSalary() { //==하면안됨 why? 주소를 비교하는게 아니라 값을 비교해야해서
        if (title.equals("부장")) totalSalary = (int) (baseSalary + baseSalary * 0.25);
        else if (title.equals("과장")) totalSalary = (int) (baseSalary + baseSalary * 0.15);
        else totalSalary = (int) (baseSalary + baseSalary * 0.05);

        switch (title) {
            case "부장":
                totalSalary = baseSalary + (int) (baseSalary * 0.25);
                break;
            case "과장":
                totalSalary = baseSalary + (int) (baseSalary * 0.15);
                break;
            default:
                totalSalary = baseSalary + (int) (baseSalary * 0.05);
                break;
        }
    }

    public void print() {
        System.out.println(title + " 직급의 " + name + "씨의 본봉은 " + baseSalary + "원이고 "
                + "총급여는 " + totalSalary + "원입니다.");
    }
}
