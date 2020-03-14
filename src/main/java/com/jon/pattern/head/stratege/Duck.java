package com.jon.pattern.head.stratege;


public class Duck {

    protected QuackBehavior quackBehavior;
    protected FlayBehavior flayBehavior;



    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flayBehavior.fly();
    }

    //动态改变鸭子 Fly  Behavior的方式
    public void setFlyBehavior(FlayBehavior fb){
        flayBehavior = fb;
    }
    //动态改变鸭子 Fly  Quack的方式
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

    void swim(){
        System.out.println("duck swim()");
    }

    void display(){
        System.out.println("duck display()");
    }
}
