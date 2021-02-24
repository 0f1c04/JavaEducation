package com.kosta.day08;

public class RemoteControlExample {
    public static void main(String[] args) {
        //method1(new Television());

        //익명구현객체: 익명의 interface를 구현한 class
        method1(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("익명 객체 ... turnOn");
            }

            @Override
            public void turnOff() {
                System.out.println("익명 객체 ... turnOff");
            }

            @Override
            public void setVolume(int volume) {
                System.out.println("익명 객체 ... setVolume " + volume);
            }
        });

        method2();
    }

    private static void method3(RemoteControl rc) {
        rc.turnOn();
        if(rc instanceof SmartTelevision) {
            ((SmartTelevision)rc).search("https://google.com");
        }
        rc.setMute(false);
        rc.setVolume(10);
        rc.turnOff();
    }

    private static void method2() {
        SmartTelevision stv = new SmartTelevision();
        RemoteControl rc = new SmartTelevision();
        RemoteControl rc2 = new Television();

        method3(stv);
        method3(rc);
        method3(rc2);
    }

    private static void method1(RemoteControl rc) {
        rc.turnOn();
        rc.setVolume(20);
        rc.setMute(true);
        rc.setMute(false);
        rc.turnOff();

        RemoteControl.changeBattery();
    }
}
