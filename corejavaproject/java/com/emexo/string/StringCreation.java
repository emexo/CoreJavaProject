package com.emexo.string;

import java.util.Scanner;

public class StringCreation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input:");
        String input = scanner.nextLine();

        for(int i=0; i<=input.length()-1; i++){
            String str = String.valueOf(input.charAt(i));
            System.out.println(str.toUpperCase());
        }

    }

}


