package com.jon.pattern.head.decorator.simple;

/**
 *  看代码前，写的装饰例子，接来从代码中验证
 */
public class TestSimple {
    public static void main(String[] args) {
        HouseBlend houseBlend = new HouseBlend();
        System.out.println(new CondimentDecorator(houseBlend).cost());
    }
}
