package com.jon.pattern.head.command;

import com.jon.pattern.head.command.simple.Light;
import com.jon.pattern.head.command.simple.LightOffCommand;
import com.jon.pattern.head.command.simple.LightOnCommand;

public class RemoteLoader {
    public static void main(String[] args) {
        Light livingRoomLight = new Light("Living Room");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);


        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0,livingRoomLightOn,livingRoomLightOff);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

    }
}
