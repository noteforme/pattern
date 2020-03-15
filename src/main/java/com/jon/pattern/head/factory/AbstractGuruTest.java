package com.jon.pattern.head.factory;

import com.jon.pattern.guru.Abstract.*;

/**
 * https://refactoringguru.cn/design-patterns/abstract-factory
 */
public class AbstractGuruTest {
    private static GUIFactory factory;

    public static void main(String[] args) throws Exception {
//        String configOs = "Windows";
        String configOs = "Mac";
        if (configOs.equals("Windows")) {
            factory = new WinFactory();
        }else if (configOs.equals("Mac")){
            factory = new MacFactory();
        }else if (configOs.equals("Android")){
//            factory = new AndroidFactory();
        } else {
            throw  new Exception("未知系统");
        }

        Application application = new Application(factory);
        application.createUi();
        application.paint();

    }
}
