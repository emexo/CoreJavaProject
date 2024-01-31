package com.emexo.conditionalstatement;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if(score > 90){
            System.out.println("Grade A");
        } else if(score > 70 && score <90) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C");
        }
    }
}
