package com.jon.pattern.head.factory.gurufactory;

public class WebDialogFac extends Dialog {
    Button createButton() {
        return new HTMLButton();
    }
}
