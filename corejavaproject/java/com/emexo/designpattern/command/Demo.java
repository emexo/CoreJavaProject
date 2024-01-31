package com.emexo.designpattern.command;


public class Demo   //client
{
    public static void main(String[] args)
    {
        Light livingRoomLight = new Light();    //receiver 1

        Fan livingRoomFan = new Fan();  //receiver 2

        Light bedRoomLight = new Light();   //receiver 3

        Fan bedRoomFan = new Fan();     //receiver 4

        HomeAutomationRemote remote = new HomeAutomationRemote();   //Invoker

        remote.setCommand(new TurnOnLightCommand( livingRoomLight ));
        remote.buttonPressed();

        remote.setCommand(new TurnOnLightCommand( bedRoomLight ));
        remote.buttonPressed();

        remote.setCommand(new StartFanCommand( livingRoomFan ));
        remote.buttonPressed();

        remote.setCommand(new StopFanCommand( livingRoomFan ));
        remote.buttonPressed();

        remote.setCommand(new StartFanCommand( bedRoomFan ));
        remote.buttonPressed();

        remote.setCommand(new StopFanCommand( bedRoomFan ));
        remote.buttonPressed();
    }
}

