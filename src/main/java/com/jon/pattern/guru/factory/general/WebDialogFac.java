package com.jon.pattern.guru.factory.general;

public class WebDialogFac extends Dialog {
    Button createButton() {
        return new HTMLButton();
    }
}
