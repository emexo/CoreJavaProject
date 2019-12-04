package com.example.string;

public class TestMain {
    public static void main(String[] args) {
        StringCompare obj = new StringCompare();

        String str1 = "hi";
        String str2 = new String("hi");

        boolean res = obj.compareUsingDoubleEquals(str1,str2);
        System.out.println(res);
    }
}
