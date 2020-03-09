package com.jon.pattern.head.factory;


import com.jon.pattern.head.factory.abstractfac.NYPizzaStore;
import com.jon.pattern.head.factory.abstractfac.PizzaStore;

/**
 * abstract factory
 */
public class AbstractTest {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");


    }
}
