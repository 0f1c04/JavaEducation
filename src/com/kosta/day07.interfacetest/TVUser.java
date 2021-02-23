package com.kosta.day07.interfacetest;

public class TVUser {
    public static void main(String[] args) {
        TVinterface TVinterface = new KostaTVinterface();
        TVinterface.powerOn();
        TVinterface.powerOff();
        ((KostaTVinterface) TVinterface).display();

        TVinterface TVinterface2 = new GasanTVinterface();
        TVinterface2.powerOn();
        TVinterface2.powerOff();
        ((GasanTVinterface) TVinterface2).print();
    }
}
