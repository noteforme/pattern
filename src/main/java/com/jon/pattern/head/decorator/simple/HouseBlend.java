package com.jon.pattern.head.decorator.simple;

public class HouseBlend  extends  Beverage{

    public HouseBlend() {
    }

    public HouseBlend(Beverage beverage) {
        super(beverage);
    }

    double cost() {
        return 5.0;
    }
}
