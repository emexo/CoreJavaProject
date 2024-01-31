package com.emexo.designpattern.strategy;

public class InstagramStrategy implements ISocialMediaStrategy {

    public void connectTo(String friendName)
    {
        System.out.println("Connecting with " + friendName + " through Instagram");
    }
}