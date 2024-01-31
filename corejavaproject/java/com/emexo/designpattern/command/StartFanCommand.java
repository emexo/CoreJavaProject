package com.emexo.designpattern.command;


public class StartFanCommand implements ICommand {

    Fan fan;

    public StartFanCommand(Fan fan) {
        super();
        this.fan = fan;
    }

    public void execute() {
        System.out.println("starting Fan.");
        fan.start();
    }
}
