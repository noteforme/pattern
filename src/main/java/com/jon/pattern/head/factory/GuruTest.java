package com.jon.pattern.head.factory;

import com.jon.pattern.head.factory.guru.Application;
import com.jon.pattern.head.factory.guru.GUIFactory;
import com.jon.pattern.head.factory.guru.MacFactory;
import com.jon.pattern.head.factory.guru.WinFactory;
import com.sun.deploy.uitoolkit.WindowFactory;

/**
 * https://refactoringguru.cn/design-patterns/abstract-factory
 */
public class GuruTest {
    private static GUIFactory factory;

    public static void main(String[] args) throws Exception {
//        String configOs = "Windows";
        String configOs = "Mac";
        if (configOs.equals("Windows")) {
            factory = new WinFactory();
        }else if (configOs.equals("Mac")){
            factory = new MacFactory();
        }else if (configOs.equals("Android")){
            factory = new MacFactory();
        } else {
            throw  new Exception("未知系统");
        }

        Application application = new Application(factory);
        application.createUi();
        application.paint();

    }
}
