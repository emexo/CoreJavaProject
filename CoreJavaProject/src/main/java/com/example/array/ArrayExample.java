package com.example.array;

public class ArrayExample {

    public static void main(String[] args) {

    }

    public void test() {
        int[] input = new int[5];
        input[0] = 1;
        input[1] =10;
        input[2] = 12;

        for (int i=0; i<input.length; i++){
            System.out.println(input[i]);
        }
    }

    public void test1() {
        int[] input = {1, 10, 12};

        for (int i=0; i<input.length; i++){
            System.out.println(input[i]);
        }
    }
}
