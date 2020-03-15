package com.jon.pattern.head.command.simple;

import com.jon.pattern.head.command.simple.*;

public class TestSimple {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();

        simpleRemoteControl.setCommand(new LightOffCommand(light));
        simpleRemoteControl.buttonWasPressed();


        simpleRemoteControl.setCommand(new GarageDoorOpenCommand(new GarageDoor()));
        simpleRemoteControl.buttonWasPressed();

    }
}
