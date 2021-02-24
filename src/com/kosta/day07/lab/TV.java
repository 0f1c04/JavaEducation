package com.kosta.day07.lab;

public class TV implements Volume {
    int volLevel;

    @Override
    public void volumeUp(int volLevel) {
        this.volLevel += volLevel;
        System.out.println("TV볼륨 올립니다." + this.volLevel);
    }

    @Override
    public void volumeDown(int volLevel) {
        this.volLevel -= volLevel;
        if (this.volLevel < MIN)
            this.volLevel = MIN;
        System.out.println("TV볼륨 올립니다." + this.volLevel);
    }
}
