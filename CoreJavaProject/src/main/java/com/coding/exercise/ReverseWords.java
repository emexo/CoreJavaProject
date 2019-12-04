package com.coding.exercise;

public class ReverseWords {
    
    public static void main(String[] args) {
        char[] str = "This is a string".toCharArray();
        getReverse(str);
        System.out.println(str);
    }
 
    public static void getReverse(char[] str) {
        int n = str.length;
        int start = 0;
        for(int i = 0; i < n; i++) {
            if(str[i] ==  ' ' && i > 0) {
                reverse(str, start, i-1);
                start = i+1;
            } else if(i == n-1) {
                reverse(str, start, i);
            }
        }
        reverse(str, 0, n-1);
    }
 
    private static void reverse(char[] str, int start, int end) {
        while(start < end) {
            swap(str, start, end);
            start++;
            end--;
        }
    }
 
    private static void swap(char[] str, int start, int end) {
        char tmp = str[start];
        str[start] = str[end];
        str[end] = tmp;
    }
 
}