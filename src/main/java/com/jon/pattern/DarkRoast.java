package com.jon.pattern;

public class DarkRoast extends  Beverage {

    @Override
    public double cost() {
        return super.cost() + 5.0;
    }
}
