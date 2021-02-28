package com.kosta.day08;

public class SmartTelevision implements RemoteControl, Searchable {
    private int volume;

    @Override
    public void turnOn() { //RemoteControl interface의 추상 메소드 실체 구현 메소드
        System.out.println("TV를 킵니다.");
    }

    @Override
    public void turnOff() { //RemoteControl interface의 추상 메소드 실체 구현 메소드
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume) { //RemoteControl interface의 추상 메소드 실체 구현 메소드
        if (volume > MAX_VALUE) {
            this.volume = MAX_VALUE;
        } else if (volume < MIN_VALUE) {
            this.volume = MIN_VALUE;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: " + this.volume);
    }

    @Override
    public void search(String url) { //Searchable interface의 추상 메소드 실체 구현 메소드
        System.out.println(url + "을 검색합니다.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SmartTelevision{");
        sb.append('}');
        return sb.toString();
    }
}
