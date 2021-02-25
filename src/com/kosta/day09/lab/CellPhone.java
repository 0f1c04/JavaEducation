package com.kosta.day09.lab;

import java.util.Objects;

public class CellPhone {
    private String model;
    private double battery;

    public CellPhone(String model) {
        this.model = model;
    }

    void call(int time) {
        if (time < 0) throw new IllegalArgumentException("통화시간입력오류");
        battery -= time * 0.5;
        if(battery < 0) battery = 0;
        System.out.println(time+"분 통화");
    }

    void charge(int time) {
        if (time < 0) throw new IllegalArgumentException("충전시간입력오류");
        battery += time * 3;
        if(battery > 100) battery = 100;
        System.out.println("충전 시간: " + time + "분");
    }

    void printBattery() {
        System.out.println("남은 배터리양: " + battery);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CellPhone)) return false;
        CellPhone cellPhone = (CellPhone) o;
        return Objects.equals(model, cellPhone.model);
    }
}
