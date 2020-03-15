package com.jon.pattern.head.decorator.basic;

public class DarkRoast extends  Beverage {


    @Override
    public double cost() {
        return super.cost() + 5.0;
    }
}
