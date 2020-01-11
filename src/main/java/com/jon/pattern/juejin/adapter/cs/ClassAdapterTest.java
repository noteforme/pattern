package com.jon.pattern.juejin.adapter.cs;

import com.jon.pattern.juejin.adapter.Duck;

public class ClassAdapterTest {
    public static void main(String[] args) {
        Duck duck = new ClassAdapter();
        duck.quack();
    }
}
