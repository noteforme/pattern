package com.jon.pattern.guru.factory.general;

public class Application {
    Dialog dialog;

    String configOs = "Windows";


    void initialize() throws Exception {
        if (configOs.equals("Windows")) {
            dialog = new WindowsDialogFac();
        } else if (configOs.equals("HTML")) {
            dialog = new WebDialogFac();
        } else
            throw new Exception("Error! Unknown operating system.");
    }

    // The client code works with an instance of a concrete
    // creator, albeit through its base interface. As long as
    // the client keeps working with the creator via the base
    // interface, you can pass it any creator's subclass.
    public void main() throws Exception {
        initialize();
        dialog.render();
    }

}
