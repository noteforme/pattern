package com.jon.pattern.head.factory.abstractfac;


public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NyPizzaIngredientFactory();

        if ("cheese".equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York style cheese Pizza");
        } else if ("cheese".equals(type)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York style cheese Pizza");
        } else if ("cheese".equals(type)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York style cheese Pizza");
        } else if ("cheese".equals(type)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York style cheese Pizza");
        }

        return pizza;
    }
}
