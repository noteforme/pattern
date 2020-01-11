package com.jon.pattern.head.factory.pizzfac;//package com.jon.pattern.head.factory;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza();
        } else if ("calm".equals(type)) {
            pizza = new GreekPizza();
        }
        return pizza;
    }
}
