package com.emexo.loopingstatement;

public class NestedForLoop {
    public static void main(String[] args) {
        int numRows = 5;

        outer:
        for(int i=1; i<=numRows; i++){

            inner:
            for(int j=i; j<=numRows; j++){

                if(j % 3 ==0)
                    break outer;
                System.out.print(j);
            }

            System.out.println();
        }
    }
}

