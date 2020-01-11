package com.jon.pattern.juejin.bridge;

public class GreenPen implements DrawAPI {

    public void draw(int radius, int x, int y) {
        System.out.println("用绿色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
