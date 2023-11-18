package com.emexo.loopingstatement;

import java.util.Scanner;

public class LoopingStatementExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  //50

        for(int i=1; i<=n; i++){
            System.out.println(i);
        }

        for(int i=n; i>=1; i--){
            System.out.println(i);
        }

        int j=1;
        while(j<=n){
            System.out.println(j);
            j++;
        }

        int k=1;
        do{
           System.out.println(k);
           k++;
        }while (k<=n);
    }
}

