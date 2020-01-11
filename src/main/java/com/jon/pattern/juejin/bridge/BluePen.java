package com.jon.pattern.juejin.bridge;

public class BluePen implements DrawAPI {

    public void draw(int radius, int x, int y) {
        System.out.println("用蓝色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
