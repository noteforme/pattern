package com.jon.pattern.head.stratege;

public class Quack  implements QuackBehavior {
    protected   String TAG = this.getClass().getSimpleName();

    public void quack() {
        System.out.println(TAG+"    quack()");
    }

//    public void squeak() {
//        System.out.println(TAG+"    squeak()");
//    }
//
//    public void muteQuack() {
//        System.out.println(TAG+"    muteQuack()");
//    }
}
