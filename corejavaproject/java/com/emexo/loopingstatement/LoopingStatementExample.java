package com.emexo.loopingstatement;

public class LoopingStatementExample {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i<=19; i++){

            if(i % 3 ==0)
                break;

            System.out.print(i + " ");
        }


    }


}



