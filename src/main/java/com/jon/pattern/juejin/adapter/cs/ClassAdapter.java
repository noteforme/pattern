package com.jon.pattern.juejin.adapter.cs;

import com.jon.pattern.juejin.adapter.Duck;

public class ClassAdapter extends CockClass implements Duck {
    // 鸭的呱呱叫
    public void quack(){
        System.out.println("quack()");
    }

}
