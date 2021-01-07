package com.example.lambdaexpression;

public class TestMain {
    public static void main(String[] args) {
        MyFunctionalInterface lambda = () ->  System.out.println("Executing...");
        lambda.execute();
    }
}
