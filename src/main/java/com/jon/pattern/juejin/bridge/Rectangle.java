package com.jon.pattern.juejin.bridge;

public class Rectangle extends Shape {
    private int x;
    private int y;

    public Rectangle(DrawAPI drawAPI, int x, int y) {
        super(drawAPI);
        this.x = x;
        this.y = y;
    }

    public void draw() {
        drawAPI.draw(0, x, y);
    }
}
