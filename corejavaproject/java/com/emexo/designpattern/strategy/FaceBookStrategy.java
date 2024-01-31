package com.emexo.designpattern.strategy;

public class FaceBookStrategy implements ISocialMediaStrategy {

    public void connectTo(String friendName)
    {
        System.out.println("Connecting with " + friendName + " through Facebook]");
    }
}
