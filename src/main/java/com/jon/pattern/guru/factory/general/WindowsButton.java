package com.jon.pattern.guru.factory.general;

public class WindowsButton implements Button {
    public void render() {
        System.out.println("WindowsButton   render()");
    }

    public void onClick(String cls) {
        System.out.println("WindowsButton   onClick "+cls);
    }
}
