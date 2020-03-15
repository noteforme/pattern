package com.jon.pattern.head.command.simple;

public class LightOffCommand implements  Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}
