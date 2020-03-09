package com.jon.pattern.head.factory.firstfac;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Sauce and cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato  Sauce";
        topping.add("Shredded mozzarella  Cheese");
    }

    @Override
    public void cut() {
        super.cut();
        System.out.println("Cutting the pizza into square slices");
    }
}
