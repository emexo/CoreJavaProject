package com.emexo.variable.localvariable;

/*
* weqw
* dwew
 */
public class Student {

    public static void main(String[] args) {
        String str = "hi hello how are you";
        // hI hellO hoW arE yoU
        String output  = "";

        for (int i =0; i< str.length(); i++){
            char currentChar = str.charAt(i);
            if(str.length() != i+1 &&  str.charAt(i+1)== ' '){
                output += Character.toUpperCase(currentChar);
            } else if(str.length() == i+1) {
                output += Character.toUpperCase(currentChar);
            }else {
                output += currentChar;
            }
        }
        System.out.println(output);
    }
}
