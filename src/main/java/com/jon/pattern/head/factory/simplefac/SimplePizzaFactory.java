package com.jon.pattern.head.factory.simplefac;//package com.jon.pattern.head.factory;

import com.jon.pattern.head.factory.generalfac.CheesePizza;
import com.jon.pattern.head.factory.generalfac.GreekPizza;
import com.jon.pattern.head.factory.generalfac.PepperoniPizza;
import com.jon.pattern.head.factory.generalfac.Pizza;

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
