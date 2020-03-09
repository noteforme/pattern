package com.jon.pattern.head.factory.firstfac;

public abstract class PizzaStore {


    public PizzaStore() {
    }


    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);


}
