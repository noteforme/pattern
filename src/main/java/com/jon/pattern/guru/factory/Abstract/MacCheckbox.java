package com.jon.pattern.guru.factory.Abstract;


public class MacCheckbox implements  CheckBox {
    public void paint() {
        System.out.println("根据 macOS 样式渲染复选框。   MacCheckbox");
    }
}
