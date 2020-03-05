package com.jon.pattern.juejin.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context(new BluePen());
        context.executeDraw(10,0,0);
    }
}
