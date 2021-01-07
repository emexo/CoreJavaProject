package com.example.conditionalstatements;

public class IfConditionExample {

    public static void main(String[] args) {
        IfConditionExample obj = new IfConditionExample();
        boolean res = obj.test(10);
        System.out.println("Response : "  + res);
    }

    public boolean test(int input) {
        if (input == 10) {
           return true;
        } else {
            return false;
        }
    }

    public void test1(int input1) {
        if (input1 == 10) {
            System.out.println("Valid Input" + input1);
        } else if (input1 == 20) {
            System.out.println("Invalid Input" +input1);
        } else if (input1 == 30) {
            System.out.println("Invalid Input" + input1);
        } else {
            System.out.println("Else");
        }
    }

}
