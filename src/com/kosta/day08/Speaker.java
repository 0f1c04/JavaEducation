package com.kosta.day08;

public class Speaker implements Volume {
    int volLevel;

    public Speaker() {
    }

    @Override
    public void volumeUp(int volLevel) {
        this.volLevel += volLevel;
        if (this.volLevel > 100)
            this.volLevel = 100;

        System.out.println("speak불륨 올립니다." + this.volLevel);
    }

    @Override
    public void volumeDown(int volLevel) {
        this.volLevel -= volLevel;
        if (this.volLevel < 0)
            this.volLevel = 0;

        System.out.println("speak불륨 내립니다." + this.volLevel);
    }
}
