package com.jon.pattern.head.stratege;

public class FlyRocketPowered implements FlayBehavior {
    protected   String TAG = this.getClass().getSimpleName();

    public void fly() {
        System.out.println(TAG + " I'm flying with a rocket!");
    }

}
