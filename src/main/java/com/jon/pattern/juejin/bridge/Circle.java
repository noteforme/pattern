package com.jon.pattern.juejin.bridge;

public class Circle extends Shape {
    private int radius;

    public Circle(DrawAPI drawAPI, int radius) {
        super(drawAPI);
        this.radius = radius;
    }

    public void draw() {
        drawAPI.draw(radius,0,0);
    }
}
