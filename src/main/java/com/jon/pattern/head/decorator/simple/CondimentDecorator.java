package com.jon.pattern.head.decorator.simple;


public class CondimentDecorator extends Beverage {
    public CondimentDecorator(Beverage beverage) {
        super(beverage);
    }

    double cost(){
       return beverage.cost() + 2.0;
    }
}
