package com.jon.pattern.guru.factory.Abstract;

public class MacButton implements Button{
    public void paint() {
        System.out.println("根据 macOs 样式渲染按钮 MacButton");
    }
}
