package com.kosta.day07.lab;

public class Speaker implements Volume {
    int volLevel;

    public Speaker() {
    }

    @Override
    public void volumeUp(int volLevel) {
        this.volLevel += volLevel;
        if (this.volLevel > MAX)
            this.volLevel = MAX;

        System.out.println("speak불륨 올립니다." + this.volLevel);
    }

    @Override
    public void volumeDown(int volLevel) {
        this.volLevel -= volLevel;
        if (this.volLevel < MIN)
            this.volLevel = MIN;

        System.out.println("speak불륨 내립니다." + this.volLevel);
    }
}
