package com.example.loopingstatements;

public class ForLoopExample {

    public static void main(String[] args) {
        ForLoopExample obj = new ForLoopExample();
        obj.testForLoop(5);
    }

    public void testForLoop(int input){

        for(int i=0; i<input; i++) {
            System.out.println(i);
        }

    }

    public void testWhileLoop(int input){
        int j =0;
        while (j<input){
            System.out.println(j);
            j++;
        }
    }

    public void testDoWhileLoop(int input){
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while(i<input);
    }
}
