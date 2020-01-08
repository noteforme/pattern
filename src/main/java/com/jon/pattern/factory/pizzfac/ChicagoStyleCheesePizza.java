package com.jon.pattern.factory.pizzfac;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Sauce and cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato  Sauce";
        topping.add("Shredded mozzarella  Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

    @Override
    void prepare() {
        super.prepare();
    }

    @Override
    void bake() {
        super.bake();
    }

    @Override
    void box() {
        super.box();
    }

    @Override
    void printOperation(String op) {
        super.printOperation(op);
    }
}
