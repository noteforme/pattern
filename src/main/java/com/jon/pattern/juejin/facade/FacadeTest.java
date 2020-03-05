package com.jon.pattern.juejin.facade;

public class FacadeTest {
    public static void main(String[] args) {
//        Shape shape = new Circle();
//        shape.draw();
//
//        Shape rectangle = new Rectangle();
//        rectangle.draw();


        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

    }
}
