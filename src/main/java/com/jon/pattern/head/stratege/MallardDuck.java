package com.jon.pattern.head.stratege;

public class MallardDuck extends Duck  {

    public MallardDuck() {
        quackBehavior = new Quack();
        flayBehavior = new FlayWithWings();
    }
}
