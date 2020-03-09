package com.jon.pattern.head.factory.guru;

/**
 * 工厂生产产品
 */
public class MacFactory implements  GUIFactory {
    public Button createButton() {
        return new MacButton();
    }

    public CheckBox createCheckBox() {
        return new MacCheckbox();
    }
}
