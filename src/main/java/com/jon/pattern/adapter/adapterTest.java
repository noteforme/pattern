package com.jon.pattern.adapter;

public class adapterTest {
    public static void main(String[] args) {
        Cock cock = new WildCock(); //鸡
        cock.gobble();

        // 成功将野鸡适配成鸭
        Duck duck = new CockAdapter(cock);
        duck.quack();
    }
}
