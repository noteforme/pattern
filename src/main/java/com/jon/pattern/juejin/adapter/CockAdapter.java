package com.jon.pattern.juejin.adapter;

// 毫无疑问，首先，这个适配器肯定需要 implements Duck，这样才能当做鸭来用
public class CockAdapter implements Duck {

    private Cock cock;

    // 构造方法中需要一个鸡的实例，此类就是将这只鸡适配成鸭来用
    public CockAdapter(Cock cock) {
        this.cock = cock;
    }

    // 实现鸭的呱呱叫方法
    public void quack() {
        // 内部其实是一只鸡的咕咕叫
        cock.gobble();
    }

    public void fly() {

    }
}
