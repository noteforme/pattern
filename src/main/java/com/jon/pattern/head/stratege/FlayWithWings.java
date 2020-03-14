package com.jon.pattern.head.stratege;

public class FlayWithWings implements FlayBehavior {
    protected   String TAG = this.getClass().getSimpleName();

//    public void flyWithWings() {
//        System.out.println(TAG + " flyWithWings()");
//    }

    public void fly() {
        System.out.println(TAG + " flyNoWay()");
    }
}
