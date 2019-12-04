package com.example.conditionalstatements;

public class IfConditionExample {

    public static void main(String[] args) {
        IfConditionExample obj = new IfConditionExample();
        obj.test(12);
    }

    public void test(int input) {
        if (input == 10) {
            System.out.println("Valid Input");
        } else {
            System.out.println("Invalid Input");
        }
    }

    public void test(int input1, int input2) {
        if (input1 == 10) {
            System.out.println("Valid Input");
        } else if (input1 == 20) {
            System.out.println("Invalid Input");
        } else if (input1 == 30) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("Else");
        }
    }

}
