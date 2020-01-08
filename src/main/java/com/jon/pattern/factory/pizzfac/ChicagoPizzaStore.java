package com.jon.pattern.factory.pizzfac;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new ChicagoStyleCheesePizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new ChicagoPepperoniPizza();
        } else if ("calm".equals(type)) {
            pizza = new ChicagoCalmPizza();
        }
        return pizza;
    }
}
