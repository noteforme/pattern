package com.jon.pattern.guru.factory.Abstract;


public class WinCheckbox implements  CheckBox {
    public void paint() {
        System.out.println("根据 Win 样式渲染复选框。   WinCheckbox");
    }
}
