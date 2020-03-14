package com.jon.pattern.head.factory.gurufactory;

public class WindowsDialogFac extends Dialog {
    Button createButton() {
        return new WindowsButton();
    }
}
