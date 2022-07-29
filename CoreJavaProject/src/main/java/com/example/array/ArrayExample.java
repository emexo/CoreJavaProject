package com.example.array;

public class ArrayExample {

    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.test2();
    }

    public void test() {
        int[] array = new int[5];
        array[0] = 10;
        array[1] = 1;
        array[2] = 4;
        array[3] = 4;
        array[4] = 5;
        //array[5] = 10;  // ArrayIndexOutOfBoundException
        System.out.println(array[6]);

    }

    public void test1() {
        int[] input = {1, 10, 12, 45,67,14, 23};

        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }


    public void test2() {
        int[][] input = new int[3][5];
        input[0][0] = 1;
        input[0][1] = 10;
        input[0][2] = 12;

        System.out.println(input.length);

    }


    public void test3() {
        int[][] array = { {34,32},
                          {45,87},
                          {49,76}};



        System.out.println(array[0][1]);
        System.out.println(array.length);
    }
}
