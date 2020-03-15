package com.jon.pattern.head.factory.guru.general;

public class WindowsDialogFac extends Dialog {
    Button createButton() {
        return new WindowsButton();
    }
}
