package com.jon.pattern.guru.factory.general;

public class WindowsDialogFac extends Dialog {
    Button createButton() {
        return new WindowsButton();
    }
}
