package com.jon.pattern.head.factory;

import com.jon.pattern.head.factory.generalfac.ChicagoPizzaStore;
import com.jon.pattern.head.factory.generalfac.NYPizzaStore;
import com.jon.pattern.head.factory.generalfac.Pizza;
import com.jon.pattern.head.factory.generalfac.PizzaStore;

public class PizzaGeneralTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();


        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");


        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
