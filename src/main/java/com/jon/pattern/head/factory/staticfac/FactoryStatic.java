package com.jon.pattern.head.factory.staticfac;

public class FactoryStatic {
    //静态工厂方法
    public static Cat produceCat() {
        return new Cat();
    }

    public static Dog produceDog() {
        return new Dog();
    }

    public static void main(String[] args) {
        Animal cat = FactoryStatic.produceCat();
        cat.move();

        Dog dog = FactoryStatic.produceDog();
        dog.move();
        dog.eatBone();
    }
}
