package com.jon.pattern.adapter.cs;

import com.jon.pattern.adapter.Cock;

public class CockClass  implements Cock {

    // 鸡的咕咕叫
    public void gobble(){
        System.out.println("gobble()");
    }
    // 飞
    public void fly(){
        System.out.println("fly()");
    }
}
