package com.jon.pattern.juejin.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        FoodService foodService = new FoodServiceProxy();
        foodService.makeChicken();
    }
}
