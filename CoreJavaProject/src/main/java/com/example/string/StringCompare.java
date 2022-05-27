package com.example.string;

public class StringCompare {

    public boolean compareStringUsingDoubleEquals(String str1, String str2){

        if(str1 == str2){
            return true;
        } else{
            return false;
        }
    }

    public boolean compareStringUsingEquals(String str1, String str2){

        if(str1.equals(str2)){
            return true;
        } else{
            return false;
        }
    }


    public boolean compareStringUsingCompareTo(String str5, String str6){
        if(str5.compareTo(str6)  == 0){
            return true;
        } else{
            return false;
        }
    }
}
