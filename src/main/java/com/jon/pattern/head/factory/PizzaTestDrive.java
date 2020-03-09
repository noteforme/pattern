package com.jon.pattern.head.factory;

import com.jon.pattern.head.factory.firstfac.ChicagoPizzaStore;
import com.jon.pattern.head.factory.firstfac.NYPizzaStore;
import com.jon.pattern.head.factory.firstfac.Pizza;
import com.jon.pattern.head.factory.firstfac.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();


        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");


        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
