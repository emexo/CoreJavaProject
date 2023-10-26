package com.emexo.variable.staticvariable;

/**
 * Static variable example
 */
public class Bank {
    //static variable
    public static final String BANK_NAME = "SBI";

    public static void main(String[] args) {
        // invoke the static variable
        System.out.println(Bank.BANK_NAME);
    }
}
