package com.jon.pattern.head.proxy;

public class GumballMachineTestDrive {
    public static void main(String[] args) {

        int count =0 ;

        GumballMachine gumballMachine = new GumballMachine("Canada",2);
        GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
        gumballMonitor.report();
    }
}
