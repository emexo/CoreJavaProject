package com.emexo.designpattern.command;


public class StopFanCommand implements ICommand {

    Fan fan;

    public StopFanCommand(Fan fan) {
        super();
        this.fan = fan;
    }

    public void execute() {
        System.out.println("stopping Fan.");
        fan.stop();
    }
}