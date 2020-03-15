package com.jon.pattern.guru.general;

public class WindowsDialogFac extends Dialog {
    Button createButton() {
        return new WindowsButton();
    }
}
