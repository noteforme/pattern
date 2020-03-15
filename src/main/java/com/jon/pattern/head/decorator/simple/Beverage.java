package com.jon.pattern.head.decorator.simple;

public abstract class Beverage {
    protected Beverage beverage;

    public Beverage() {
    }

    public Beverage(Beverage beverage) {
        this.beverage = beverage;
    }


    abstract double cost();
}
