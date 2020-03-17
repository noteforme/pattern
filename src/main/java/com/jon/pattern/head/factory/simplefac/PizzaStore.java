package com.jon.pattern.head.factory.simplefac;

import com.jon.pattern.head.factory.generalfac.Pizza;

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

    //伪代码
//    public PizzaMenu orderMenu(String type){
//        PizzaMenu pizzMenu = factory.createMenu(type);
//        return  pizzMenu;
//    }
}
