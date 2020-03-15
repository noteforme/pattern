package com.jon.pattern.head.adapter;

import com.jon.pattern.head.adapter.simple.Duck;
import com.jon.pattern.head.adapter.simple.DuckAdapter;
import com.jon.pattern.head.adapter.simple.MallardDuck;
import com.jon.pattern.head.adapter.simple.Turkey;

public class TestSimple {
    public static void main(String[] args) {
        /**
         * we need a duck
         */
        MallardDuck duck = new MallardDuck();

//        Turkey turkey = new WildTurkey();
//
//        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
//        System.out.println("The turkey says...");
//        turkey.gobble();
//        turkey.fly();
//
//        System.out.println("\nThe Duck says...");
//        turkey.gobble();
//        turkey.fly();
//
//        System.out.println("\nThe TurkeyAdapter says...");
//        testDuck(turkeyAdapter);

        /**
         * we need a turkey
         */
        System.out.println("we need a turkey");
        DuckAdapter duckAdapter = new DuckAdapter(duck);
        testTurkey(duckAdapter);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
    static void testTurkey(Turkey turkey){
        turkey.gobble();
        turkey.fly();
    }
}
