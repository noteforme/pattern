package com.jon.pattern.adapter.cs;

import com.jon.pattern.adapter.Duck;

public class ClassAdapterTest {
    public static void main(String[] args) {
        Duck cockClass = new ClassAdapter();
        cockClass.quack();
    }
}
