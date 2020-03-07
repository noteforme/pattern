package com.jon.pattern.head.factory.simplefactory;

import com.jon.pattern.head.factory.pizzfac.Pizza;
import com.jon.pattern.head.factory.pizzfac.SimplePizzaFactory;

public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }


    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


}
