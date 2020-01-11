package com.jon.pattern.head.factory.pizzfac;

public class NYPizzaStore extends PizzaStore {

    public NYPizzaStore() {
    }

    public NYPizzaStore(SimplePizzaFactory simplePizzaFactory) {
        super(simplePizzaFactory);
    }

    @Override
    public Pizza createPizza(String type) {
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
