package com.jon.pattern.guru.factory.Abstract;

// Concrete products are created by corresponding concrete
// factories.
public class WinButton implements Button{
    public void paint() {
        System.out.println("根据 Windows 样式渲染按钮   WinButton");
    }
}
