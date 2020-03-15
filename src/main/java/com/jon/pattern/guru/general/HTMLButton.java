package com.jon.pattern.guru.general;

public class HTMLButton implements Button {
    public void render() {
        System.out.println("HTMLButton   render()");
    }

    public void onClick(String cls) {
        System.out.println("HTMLButton   onClick "+cls);
    }
}
