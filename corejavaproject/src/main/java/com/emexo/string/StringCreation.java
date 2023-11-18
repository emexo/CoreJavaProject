package com.emexo.string;

import java.util.Scanner;

public class StringCreation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input:");

        String input = scanner.next();
        int length = input.length();

        for(int i=0; i<length; i++){
            System.out.println(input.substring(0, i));
        }

    }

}
