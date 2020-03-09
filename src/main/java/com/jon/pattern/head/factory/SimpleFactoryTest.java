package com.jon.pattern.head.factory;

import com.jon.pattern.head.factory.simplefac.SimplePizzaFactory;
import com.jon.pattern.head.factory.simplefac.PizzaStore;

/**
 * 简单工厂方法
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimplePizzaFactory calmFactory = new SimplePizzaFactory();
        PizzaStore calmPizza = new PizzaStore(calmFactory);
        calmPizza.orderPizza("calm");
    }
}
