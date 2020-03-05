package com.jon.pattern.juejin.compnent;

public class CompnentTest {
    public static void main(String[] args) {
        Beverage greenTea = new GreenTea();

        Lemon lemon = new Lemon(greenTea);
        System.out.println("柠檬  绿茶价格　"+lemon.cost());


        Beverage redTea = new RedTea();

        Mango mango = new Mango(redTea);
        System.out.println("芒果 红茶   " + mango.cost());

    }
}
