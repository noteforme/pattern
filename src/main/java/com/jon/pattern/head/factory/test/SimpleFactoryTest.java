package com.jon.pattern.head.factory.test;

import com.jon.pattern.head.factory.pizzfac.SimplePizzaFactory;
import com.jon.pattern.head.factory.simplefactory.PizzaStore;

/**
 * 简单工厂方法
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {

        new PizzaStore(new SimplePizzaFactory()).orderPizza("calm");

    }
}
