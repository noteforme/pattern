package com.jon.pattern.factory.pizzfac;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new NYStyleCheesePizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new NyPepperoniPizza();
        } else if ("calm".equals(type)) {
            pizza = new NYCalmPizza();
        }
        return pizza;
    }
}
