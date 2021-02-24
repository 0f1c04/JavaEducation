package com.kosta.day07.lab;

public class Radio implements Volume {
    int volLevel;

    @Override
    public void volumeUp(int volLevel) {
        this.volLevel += volLevel;
        System.out.println("Radio볼륨 올립니다." + this.volLevel);
    }

    @Override
    public void volumeDown(int volLevel) {
        this.volLevel -= volLevel;
        System.out.println("Radio볼륨 내립니다." + this.volLevel);
    }
}
