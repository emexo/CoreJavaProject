package com.coding.exercise;

import java.io.*;

public class AddSpecialCharBeforeOddAndEven {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s;
    while ((s = in.readLine()) != null) {
     String str = s;
     char[] numbers = str.toCharArray();
     String result = "";

     for(int i = 1; i < numbers.length; i++)
     {
         int value1 = Character.getNumericValue(numbers[i-1]);
         int value2 = Character.getNumericValue(numbers[i]);
         result += value1;
         if(value1 % 2 != 0 && value2 % 2 != 0) {
             result += "-";
         }
         
         if(value1 % 2 == 0 && value2 % 2 == 0) {
             result += "*";
         }
     }
     result += numbers[numbers.length - 1];
     System.out.println(result);
     
    }
  }
}
