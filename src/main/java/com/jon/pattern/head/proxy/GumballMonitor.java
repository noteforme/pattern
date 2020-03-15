package com.jon.pattern.head.proxy;

public class GumballMonitor {
    private GumballMachine machine;

    public GumballMonitor(GumballMachine machine) {
        this.machine = machine;
    }

    public void report(){
        System.out.println("Gumball Machine:    " + machine.getLocation()) ;
    }
}
