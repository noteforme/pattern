package com.jon.pattern.head.stratege;

public class StartTest {
    public static void main(String[] args) {

        //构造方法调用
     /*   Duck duck = new MallardDuck();
        duck.performQuack();
        duck.performFly();*/


        //set 方法设置FlyBehavior
        Duck  duck =  new ModelDuck();
//        duck.setFlyBehavior(new FlayWithWings());
//        duck.performFly();
//        duck.setFlyBehavior(new FlyRocketPowered());
//        duck.performFly();
//
//        duck.setQuackBehavior(new Quack());
//        duck.performQuack();


        //Brain power
        duck.setQuackBehavior(new DuckCall());
        duck.performQuack();
    }
}
