package com.emexo.exception;

public class ExceptionExample1 {
    public static void main(String[] args) {
        ExceptionExample1 obj = new ExceptionExample1();
        try {
            int res = obj.divide(10, 0);
            System.out.println(res);
        }catch (InvalidInputException ex){
            ex.printStackTrace();
        }
    }

    public int divide(int input1, int input2) throws InvalidInputException{
        if(input1 <=0 || input2 <= 0){
            throw new InvalidInputException("Invalid input");
        }
        int response = 0;
        response = input1/input2;

        System.out.println("output:"+ response);
        return response;
    }



}
