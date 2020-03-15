package com.jon.pattern.head.adapter.simple;

public class DuckAdapter implements  Turkey {
    private Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }


    public void gobble() {
        duck.quack();
    }

    public void fly() {
        duck.fly();
    }
}
