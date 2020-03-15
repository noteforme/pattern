package com.jon.pattern.head.command;

import com.jon.pattern.head.command.simple.Command;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i =0;i<7;i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot,Command onCommad,Command offCommand){
        onCommands[slot] = onCommad;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n---- Remote Control ----\n");
        for (int i=0;i<onCommands.length;i++){
            stringBuff.append("[ slot " + i + "]"+onCommands[i].getClass().getName()+"\n");
        }
        return stringBuff.toString();
    }
}
