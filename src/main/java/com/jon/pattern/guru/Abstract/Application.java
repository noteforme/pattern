package com.jon.pattern.guru.Abstract;

public class Application {
    private GUIFactory factory;
    private Button button;
    private CheckBox checkBox;
    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUi() {
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
    }

    public  void paint(){
        button.paint();
        checkBox.paint();
    }
}
