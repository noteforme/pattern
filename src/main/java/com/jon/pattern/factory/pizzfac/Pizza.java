package com.jon.pattern.factory.pizzfac;

import java.util.ArrayList;

public class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList topping = new ArrayList();

    void prepare() {
        printOperation("preparing     " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce");
        System.out.println("Adding topping: ");
        for (int i=0;i<topping.size();i++){
            System.out.println("    "+topping.get(i));
        }
    }

    void bake() {
        printOperation("bake  for 25 minutes at 350");
    }

    void cut() {
        printOperation("Cutting the pizza into diagonal slices");
    }

    void box() {
        printOperation("Place pizza in official pizzaStore bx");
    }

    void printOperation(String op) {
        System.out.println(/*getClass().getSimpleName() + " " +*/ op);
    }

    public String getName(){
        return  name;
    }

}
