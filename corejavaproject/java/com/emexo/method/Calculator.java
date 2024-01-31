package com.emexo.method;


import java.util.Scanner;

/**
 * Example  for Method
 */
public class Calculator {

    /**
     * Addition
     * @param input1
     * @param input2
     * @return
     */
    public long add(long input1, long input2 ){
        long addition = input1 + input2;  // addition
        return addition;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input:");


        Calculator calculator = new Calculator();
        long response = calculator.add(scanner.nextLong(), scanner.nextLong());
        System.out.println(response);
    }


}
