package com.jon.pattern.head.factory.guru.general;

public class WebDialogFac extends Dialog {
    Button createButton() {
        return new HTMLButton();
    }
}
