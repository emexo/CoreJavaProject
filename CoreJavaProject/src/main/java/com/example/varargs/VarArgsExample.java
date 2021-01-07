package com.example.varargs;

/**
 * Variable Argument
 */
public class VarArgsExample {

    public static void main(String[] args) {
        VarArgsExample obj = new VarArgsExample();
        obj.method1(1);
        obj.method1(1,2);
    }

    public void method1(int... input){
        int[] array = input;
        for(int i= 0; i< array.length; i++ ) {
            System.out.println(array[i]);
        }
    }
}
