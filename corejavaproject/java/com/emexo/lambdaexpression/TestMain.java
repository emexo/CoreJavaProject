package com.emexo.lambdaexpression;

public class TestMain {
    public static void main(String[] args) {
        TestInterface test = ()-> {
            System.out.println("Test Functional interface");
            System.out.println("###Test Functional interface##");
        };
        test.print();


        Addition addition = (input1, input2)-> input1+input2;

        int response = addition.add(5, 4);
        System.out.println(response);
    }
}
