package com.jon.pattern.head.command.simple;

public class Light {

    private String light;

    public Light() {
    }

    public Light(String mLight) {
        this.light = mLight;
    }

    void on() {
        System.out.println("Light on()");
    }

    void off() {
        System.out.println("Light off");
    }
}
