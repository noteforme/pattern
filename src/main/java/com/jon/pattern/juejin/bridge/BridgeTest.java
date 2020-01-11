package com.jon.pattern.juejin.bridge;

public class BridgeTest {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(new BluePen(),10,20);
        rectangle.draw();
        Shape circle = new Circle(new GreenPen(),40);
        circle.draw();
    }
}
