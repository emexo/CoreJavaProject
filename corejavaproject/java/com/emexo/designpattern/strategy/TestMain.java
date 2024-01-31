package com.emexo.designpattern.strategy;

public class TestMain {
    public static void main(String[] args) {

        // Creating social Media Connect Object for connecting with friend by
        // any social media strategy.
        SocialMediaContext context = new SocialMediaContext();

        // Setting Twitter strategy.
        context.setSocialmediaStrategy(new TwitterStrategy());
        context.connect("Lokesh");

        System.out.println("====================");

        // Setting instagram strategy.
        context.setSocialmediaStrategy(new InstagramStrategy());
        context.connect("Lokesh");

        System.out.println("====================");

        // Setting facebook strategy.
        context.setSocialmediaStrategy(new FaceBookStrategy());
        context.connect("Lokesh");
    }
}

