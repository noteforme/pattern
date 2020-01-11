package com.jon.pattern.head.factory;

import com.jon.pattern.head.factory.pizzfac.NYPizzaStore;
import com.jon.pattern.head.factory.pizzfac.Pizza;
import com.jon.pattern.head.factory.pizzfac.SimplePizzaFactory;

public class HeadFactoryTest {
    public static void main(String[] args) {

        //简单工厂方法
        Pizza pizza = new NYPizzaStore(new SimplePizzaFactory()).createPizza("cheese");
        pizza.bake();

    }
}
